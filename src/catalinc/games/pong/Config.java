package catalinc.games.pong;

import android.content.Context;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

/**
 * Created by josh on 6/16/14.
 */
public class Config {
    public static String socketHost = "50.97.196.120";
    public static int getBallSpeed(Context context) {
        return MixpanelAPI.getInstance(context, "1ef7e30d2a58d27f4b90c42e31d6d7ad").getTweaks().getInteger("Ball speed", 8);
    }
}
