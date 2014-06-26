package catalinc.games.pong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

/**
 * Created by josh on 6/16/14.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        MixpanelAPI mMixpanel = MixpanelAPI.getInstance(this, "1ef7e30d2a58d27f4b90c42e31d6d7ad");
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void startGame(View view) {
        Intent myIntent = new Intent(MainActivity.this, Pong.class);
        MainActivity.this.startActivity(myIntent);
    }
}