package sg.edu.rp.c346.demoreceiverapp;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        br = new BatterReceiver();

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction("android.intent.action.BATTERY_LOW");
        this.registerReceiver(br,filter);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        this.unregisterReceiver(br);
    }
}
