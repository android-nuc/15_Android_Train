package com.androidlab.activity_04;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by dream on 16/1/3.
 */
public class SecondActivity extends Activity{

    public static final String TAG ="SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

}
