package sg.edu.rp.c346.demoreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatterReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context,"Low Batter", Toast.LENGTH_LONG);
        my_toast.show();
    }
}
