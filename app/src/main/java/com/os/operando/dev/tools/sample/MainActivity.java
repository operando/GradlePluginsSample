package com.os.operando.dev.tools.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.drivemode.intentlog.IntentLogger;
import com.socks.library.KLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KLog.d();
        KLog.d("test");

        IntentLogger.dump("test", getIntent());
    }
}
