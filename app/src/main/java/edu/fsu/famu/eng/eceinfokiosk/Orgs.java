package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.webkit.WebView;


public class Orgs extends AppCompatActivity {

    //private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orgs);


    }
    public void toMain(View view) {
        //call main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }
