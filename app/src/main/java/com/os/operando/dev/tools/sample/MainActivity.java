package com.os.operando.dev.tools.sample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;

import com.drivemode.intentlog.IntentLogger;
import com.socks.library.KLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KLog.d("test");

        IntentLogger.dump("test", getIntent());

        ViewDebug.dumpCapturedView("view debug", findViewById(R.id.button));
    }


    public void onClick(View v) {
        SharedPreferences sp = getSharedPreferences("test", MODE_PRIVATE);
        int count = sp.getInt("click", 0);
        ++count;
        sp.edit().putInt("click", count).apply();
    }
}
