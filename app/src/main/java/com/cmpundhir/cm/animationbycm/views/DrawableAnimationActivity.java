package com.cmpundhir.cm.animationbycm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cmpundhir.cm.animationbycm.R;

public class DrawableAnimationActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    AnimationDrawable rocketAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.rocket);
        rocketAnimation = (AnimationDrawable) imageView.getBackground();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rocketAnimation.start();
            }
        });


    }

}
