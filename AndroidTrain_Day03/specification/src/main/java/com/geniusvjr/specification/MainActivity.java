package com.geniusvjr.specification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Activity命名：登陆界面：LoginActivity
 * Adapter
 * 布局文件：act_
 * ListView: item_
 * Dialog: dlg_
 * EditText et
 * ListView lv
 * ImageView iv
 */
public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private TextView tv;
//    public static final String CLASS_NAME = "DDD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }
}
