package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iconActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btn_icon;
    private Drawable drawable;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        btn_icon = findViewById(R.id.btn_icon);
        drawable = getResources().getDrawable(R.mipmap.ic_launcher);
        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());

        findViewById(R.id.btn_left).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn_top).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn_rigjt).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn_bottom).setOnClickListener((View.OnClickListener) this);



    }

    public void onClick(View v){
        if(v.getId() == R.id.btn_left){
            btn_icon.setCompoundDrawables(drawable,null,null,null);
        } else if (v.getId() == R.id.btn_top){
            btn_icon.setCompoundDrawables(null,drawable,null,null);
        } else if (v.getId() == R.id.btn_rigjt){
            btn_icon.setCompoundDrawables(null,null,drawable,null);
        } else if(v.getId() == R.id.btn_bottom){
            btn_icon.setCompoundDrawables(null,null,null,drawable);
        }
    }


}