package com.example.hw5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        web=findViewById(R.id.brose);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                return false;
            }
        });
        web.loadUrl("http://www.twitch.tv");
    }

    @Override
    public boolean onKeyDown(int code, KeyEvent event){
        if(code==KeyEvent.KEYCODE_BACK&&web.canGoBack()){
            web.goBack();
        }
        return super.onKeyDown(code,event);
    }
}
