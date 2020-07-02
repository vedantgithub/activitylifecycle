package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();


    private void showLog(String text){

        Log.d(HOME_ACTIVITY_TAG, text);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "create", Toast.LENGTH_SHORT).show();
    }
    @Override

    protected void onRestart(){

        super.onRestart();//call to restart after onStop

        showLog("Activity restarted");
        Toast.makeText(this, "on restart", Toast.LENGTH_SHORT).show();

    }
    @Override

    protected void onStart() {

        super.onStart();//soon be visible

        showLog("Activity started");
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onResume() {

        super.onResume();//visible

        showLog("Activity resumed");
        Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();

    }
    @Override

    protected void onPause() {

        super.onPause();//invisible

        showLog("Activity paused");
        Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onStop() {

        super.onStop();

        showLog("Activity stopped");
        Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();

        showLog("Activity is being destroyed");
        Toast.makeText(this, "destroy", Toast.LENGTH_SHORT).show();

    }


}
