package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
    }
    public void toMain(View view) {
        //call main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void correct(View view){
        //call correct activity
        Intent intent = new Intent(this,Correct3.class);
        startActivity(intent);
    }

    public void incorrect(View view){
        //call incorrect activity
        Intent intent = new Intent(this,Incorrect3.class);
        startActivity(intent);
    }

}
