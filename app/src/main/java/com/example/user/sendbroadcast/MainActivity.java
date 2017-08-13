package com.example.user.sendbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view){

        Intent sendItent = new Intent();

        sendItent.setAction("com.example.sendbroadcast");
        sendItent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendItent.putExtra("Sent", "tortue");
        sendBroadcast(sendItent); // different from your above.
    }
}
