package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Events extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


    }
    public void toMain(View view) {
        //call main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
