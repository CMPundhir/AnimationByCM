package com.cmpundhir.cm.animationbycm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cmpundhir.cm.animationbycm.R;

public class PropertyAnimationActivtiy extends AppCompatActivity {

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
                valueAnimator();
            }
        });
    }
    private void valueAnimator(){
        ObjectAnimator animation = ObjectAnimator.ofFloat(imageView, "translationX", 1000f);
        animation.setDuration(1000);

        ObjectAnimator animation2 = ObjectAnimator.ofFloat(imageView, "translationY", -1000f);
        animation2.setDuration(1000);

        animation2.start();
        animation.start();



    }
}
