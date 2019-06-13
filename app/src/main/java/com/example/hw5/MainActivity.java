package com.example.hw5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button webB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webB=findViewById(R.id.button);
    }

    public void goWeb(View v){
        Intent intent=new Intent();
        intent.setClass(this,Web.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void compound(View v){
        Intent intent=new Intent();
        intent.setClass(this,Compound.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void seek(View v){
        Intent intent=new Intent();
        intent.setClass(this,SeekBar2.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void scroll(View v){
        Intent intent=new Intent();
        intent.setClass(this,Scroll.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void star(View v){
        Intent intent=new Intent();
        intent.setClass(this,RatioStar.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void men(View v){
        Intent intent=new Intent();
        intent.setClass(this,Men.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void spinner(View v){
        Intent intent=new Intent();
        intent.setClass(this,Sp.class);
        startActivity(intent);
        //MainActivity.this.finish();
    }

    public void KHGRich(View v){
        Intent intent=new Intent();
        intent.setClass(this,LifeCycle.class);
        startActivity(intent);
    }
}
