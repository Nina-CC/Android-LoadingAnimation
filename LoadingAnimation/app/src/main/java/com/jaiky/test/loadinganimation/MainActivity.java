package com.jaiky.test.loadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    ListAniImageView flWhite, flGray;

    Object mObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        flWhite = (ListAniImageView) findViewById(R.id.flWhite);
        flGray = (ListAniImageView) findViewById(R.id.flGray);

        //暂停动画（停留在当前帧）
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flWhite.pauseAnimation();
                flGray.pauseAnimation();
            }
        });
        //停止动画（停止到第一帧）
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flWhite.stopAnimation();
                flGray.stopAnimation();
            }
        });
        //开始动画
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flWhite.startAnimation();
                flGray.startAnimation();
            }
        });
    }




}
