package com.cmpundhir.cm.animationbycm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.print.PrinterId;
import android.view.View;
import android.widget.ImageView;

import com.cmpundhir.cm.animationbycm.R;

public class AnimateMethodActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_method);
        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.rocket);
    }
    int angle = 360;
    public void on1Click(View view){
        imageView.animate().rotation(angle).setDuration(2000).start();
        angle+=360;
    }
    boolean flag = true;
    public void on2Click(View view){
        if(flag) {
            imageView.setAlpha(1);
            imageView.animate().alpha(0).start();
        }else{
            imageView.setAlpha(0);
            imageView.animate().alpha(1).start();
        }
        flag = !flag;
    }
    public void on3Click(View view){
        if(flag) {
            imageView.animate().scaleX(2).start();
            imageView.animate().scaleY(2).start();
        }else{
            imageView.animate().scaleX(0.25f).start();
            imageView.animate().scaleY(0.25f).start();
        }
        flag = !flag;
    }
}
