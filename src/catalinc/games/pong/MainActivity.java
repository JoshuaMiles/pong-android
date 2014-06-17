package catalinc.games.pong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mixpanel.android.introspector.EditableActivity;
import com.mixpanel.android.introspector.ViewClient;
import com.mixpanel.android.introspector.ViewRegistry;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by josh on 6/16/14.
 */
public class MainActivity extends EditableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.main_layout);

        MixpanelAPI mMixpanel = MixpanelAPI.getInstance(this, "1ef7e30d2a58d27f4b90c42e31d6d7ad");
        Config.getBallSpeed(this);

        Config.connectToProxy(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        Config.connectToProxy(this);
    }

    public void startGame(View view) {
        Intent myIntent = new Intent(MainActivity.this, Pong.class);
        MainActivity.this.startActivity(myIntent);
    }
}