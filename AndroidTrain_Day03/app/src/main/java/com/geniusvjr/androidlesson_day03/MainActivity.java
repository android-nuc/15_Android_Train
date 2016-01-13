package com.geniusvjr.androidlesson_day03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 四种启动模式
 * standard
 * 不管有没有已存在的实例，都生成新的实例。
 */
public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        tv.setText(this.toString());
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
