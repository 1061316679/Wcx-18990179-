package com.example.homework;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;




public class activity_bbs extends AppCompatActivity implements View.OnClickListener , View.OnLongClickListener {

    private TextView tv_bbs;
    private TextView tv_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_control = findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs = findViewById(R.id.tv_bbs);
        tv_bbs.setOnClickListener(this);
        tv_bbs.setOnLongClickListener(this);
        //设置tv_bbs 内部文本移动方式为滚动形式
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    private String[] mChatStr = {"1","2？","3？","4",};

    public void onClick(View v){
        if(v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs){
            //
            int random = (int) (Math.random() * 10) % 5;
            //
            String newStr = String.format("%s\n%s %s",
                    tv_bbs.getText().toString(),DateUtils.getNowTime(), mChatStr[random]);
            //
            tv_bbs.setText(newStr);
        }
    }

    public boolean onLongClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs){
            tv_bbs.setText("");
        }
        return true;
    }


    private static class DateUtils {
        @SuppressLint("SimpleDateFormat")
        public static String getNowDateTime(){
            SimpleDateFormat s_format = new SimpleDateFormat( "yyyyMMddhhmmss");
            return s_format.format(new Date());
        }

        @SuppressLint("SimpleDateFormat")
        public static String getNowTime(){
            SimpleDateFormat s_format = new SimpleDateFormat("HH:nn:ss");
            return s_format.format(new Date());
        }
    }
}

