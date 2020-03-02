package com.cmpundhir.cm.animationbycm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cmpundhir.cm.animationbycm.views.AnimateMethodActivity;
import com.cmpundhir.cm.animationbycm.views.DrawableAnimationActivity;
import com.cmpundhir.cm.animationbycm.views.PropertyAnimationActivtiy;
import com.cmpundhir.cm.animationbycm.views.ValueAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(View view){
        int id = view.getId();
        Intent intent = null;
        switch (id){
            case R.id.b1: intent = new Intent(MainActivity.this, DrawableAnimationActivity.class);break;
            case R.id.b2: intent = new Intent(MainActivity.this, PropertyAnimationActivtiy.class);break;
            case R.id.b3: intent = new Intent(MainActivity.this, ValueAnimationActivity.class);break;
            case R.id.b4: intent = new Intent(MainActivity.this, AnimateMethodActivity.class);break;
        }
        if(intent!=null)
            startActivity(intent);
    }
}
