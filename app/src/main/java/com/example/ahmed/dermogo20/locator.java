package com.example.ahmed.dermogo20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class locator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locator);
        WebView WebViewMap = (WebView) findViewById(R.id.WebViewMap);

        WebViewMap.loadUrl("https://www.google.com/maps/search/dermatologist+near+me/");

    }
}
