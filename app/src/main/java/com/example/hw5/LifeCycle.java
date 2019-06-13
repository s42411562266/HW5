package com.example.hw5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LifeCycle extends AppCompatActivity {
    private TextView result;
    private final static String TAG="LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lf);
        Log.d(TAG,"onCreate");
        Toast.makeText(this,"我要發大財，所以我要選總統!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
        Toast.makeText(this,"我願意為台灣粉身碎骨!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
        Toast.makeText(this,"對於那些酸民，我都用屁眼看他們!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
        Toast.makeText(this,"我未來當上總統，我會在高雄辦公!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
        Toast.makeText(this,"香港加油!台灣加油!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart");
        Toast.makeText(this,"反送中!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
        Toast.makeText(this,"我先去征服宇宙囉!88888888~",Toast.LENGTH_LONG).show();
    }

    public void finishBut(View v){
        finish();
    }
}
