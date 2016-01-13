package com.geniusvjr.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.play);
        btnStop = (Button) findViewById(R.id.stop);
        btnStart.setOnClickListener(new StartListener());
        btnStop.setOnClickListener(new StopListener());
    }


    class StartListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Intent startIntent = new Intent(MainActivity.this, MusicService.class);
            startService(startIntent);
        }
    }

    class StopListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent stopIntent = new Intent(MainActivity.this, MusicService.class);
            stopService(stopIntent);
        }
    }
}
