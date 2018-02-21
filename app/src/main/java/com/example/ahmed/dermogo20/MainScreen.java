package com.example.ahmed.dermogo20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void goToDetector(View view){
        Intent intent= new Intent(this,detectorActivity.class);
        startActivity(intent);
    }

    public void goToDoctor(View view){
       // WebView WebViewMap = (WebView) findViewById(R.id.WebViewMap);

     //   WebViewMap.loadUrl("https://www.google.com/maps/search/dermatologist+near+me/");

          Intent intent= new Intent(this,locator.class);
        startActivity(intent);
    }
}
