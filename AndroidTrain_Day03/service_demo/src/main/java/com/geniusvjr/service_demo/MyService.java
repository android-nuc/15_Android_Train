package com.geniusvjr.service_demo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Service的生命周期
 * 第一种：onCreate()->onStartCommand() -> onDestroy()
 * Created by dream on 16/1/9.
 */
public class MyService extends Service {

    public static final String TAG = "MyService";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand executed");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy executed");
    }

    private DownloadBinder downloadBinder = new DownloadBinder();

    class DownloadBinder extends Binder {
        //开始下载
        public void startDownload() {
            Log.d(TAG, "startDownload");
        }

        //得到下载进度
        public int getProgress() {
            Log.d(TAG, "getProgress");
            return 0;
        }

    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind executed");
        return downloadBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind executed");
        return super.onUnbind(intent);
    }
}
