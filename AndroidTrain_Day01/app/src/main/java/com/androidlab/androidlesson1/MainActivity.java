package com.androidlab.androidlesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Activity本身不显示界面，通过setContentView()来显示界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv = new TextView(this);
//        tv.setText("Hello Android");
//        setContentView(tv);
    }
}
