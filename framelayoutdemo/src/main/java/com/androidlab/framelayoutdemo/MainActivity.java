package com.androidlab.framelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android:layout_gravity是设置自己在父布局的位置
 * android:gravity是设置自己内容在本身的位置
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
