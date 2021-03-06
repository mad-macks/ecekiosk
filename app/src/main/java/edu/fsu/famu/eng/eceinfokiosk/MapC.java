package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_c);
    }

    public void show_A(View view) {
        //call main activity
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void show_B(View view) {
        //call other map
        Intent intent = new Intent(this, MapB.class);
        startActivity(intent);
    }
    public void toMain(View view) {
        //call main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
