package com.cmpundhir.cm.animationbycm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cmpundhir.cm.animationbycm.R;

public class ValueAnimationActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.rocket);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rocketAnimation.start();
                valueAnimation();
            }
        });
    }

    boolean flag = false;
    private void valueAnimation(){
        if(flag) {
            ValueAnimator fadeInAnim = ObjectAnimator.ofFloat(imageView, "alpha", 0f, 1f);
            fadeInAnim.start();
            fadeInAnim.setDuration(250);
        }else{
            ValueAnimator fadeOutAnim = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0f);
            fadeOutAnim.start();
            fadeOutAnim.setDuration(250);
        }
        flag = !flag;
    }
}
