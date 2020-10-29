package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.new_p.Utils;
import com.example.myapplication.new_p.DisplayUtils;

public class MainActivity extends AppCompatActivity {

    private TextView text_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_screen = findViewById(R.id.text_screen);

        int dip_10 = Utils.dip2px( this, 10L);
        text_screen.setPadding(dip_10,dip_10,dip_10,dip_10);
        text_screen.setBackgroundColor(0xff00ffff);
        text_screen.setTextColor(0xff333333);
        showScreenInfo();

        TextView textView3 = findViewById(R.id.textView);
        textView3.setTextColor(getResources().getColor(R.color.colorAccent));
    }

    private void showScreenInfo() {
        int width = DisplayUtils.getScreenwidth(this);
        int hight = DisplayUtils.getScrrenHight(this);
        float sensity = DisplayUtils.getScrrenDensity(this);
        String info = String.format("当前宽度是%dpx，高度是%dpx，像素密度为%f",width,hight,sensity);
        text_screen.setText(info);
    }
}