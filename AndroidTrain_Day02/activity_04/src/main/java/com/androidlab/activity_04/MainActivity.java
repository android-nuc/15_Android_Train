package com.androidlab.activity_04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * activity的生命周期
 * onCreate()->onStart()->onResume()->onPause()
 * ->onStop()->onDestroy()
 * onStart()可见但不可交互
 * onResume()既可见又可交互
 * activity在内存中是栈结构
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "-------onCreate------");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "-------onStart------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "-------onResume------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "-------onPause------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "-------onStop------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "-------onDestroy------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "-------onRestart------");
    }

    public void click(View v)
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

}
