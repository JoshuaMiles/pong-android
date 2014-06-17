package catalinc.games.pong;

import android.content.Context;

import com.mixpanel.android.introspector.ViewClient;
import com.mixpanel.android.introspector.ViewRegistry;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by josh on 6/16/14.
 */
public class Config {
    protected static ViewClient viewClient;

    public static String socketHost = "50.97.196.120";

    public static int getBallSpeed(Context context) {
        return MixpanelAPI.getInstance(context, "1ef7e30d2a58d27f4b90c42e31d6d7ad").getTweaks().getInteger("Ball speed", 8);
    }

    public static ViewClient connectToProxy(Context context) {
        URI server;
        try {
            server = new URI("ws://" + Config.socketHost + "/websocket_proxy/THE_KEY");
        } catch (URISyntaxException e) {
            throw new RuntimeException("DoWhatNow?", e);
        }
        if (viewClient == null || !viewClient.isConnected())
            viewClient = new ViewClient(context, ViewRegistry.getInstance(context), server);

        return viewClient;
    }
}
