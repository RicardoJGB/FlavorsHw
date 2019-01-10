package com.mobileapps.flavorshw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(BuildConfig.FLAVOR.equals("peppermint")){
            setContentView(R.layout.activity_peppermint);
            rotate();
        }

        if(BuildConfig.FLAVOR.equals("horchata")){
            setContentView(R.layout.activity_main);
            rotate();
            blink();
            move();
        }


    }

    public void rotate (){
        imageView1=findViewById(R.id.ivImage1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        imageView1.startAnimation(animation);
    }

    public void blink (){
        imageView2=findViewById(R.id.ivImage2);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        imageView2.startAnimation(animation);
    }

    public void move (){
        imageView3=findViewById(R.id.ivImage3);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        imageView3.startAnimation(animation);
    }

}
