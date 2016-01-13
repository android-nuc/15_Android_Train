package com.geniusvjr.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Created by dream on 16/1/9.
 */
public class MusicService extends Service{

    MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this, R.raw.a);
        //开始播放音乐
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //结束播放
        mediaPlayer.stop();
    }
}
