package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Foo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo);
    }
    public void toElec(View view) {
        //go to Electrical faculty directory
        Intent intent = new Intent(this, Elec.class);
        startActivity(intent);
    }
}
