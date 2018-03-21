package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FacultyMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_menu);
    }

    public void toMain(View view) {
        //call main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toChem(View view) {
        //go to Chem faculty directory
        Intent intent = new Intent(this, Chem.class);
        startActivity(intent);
    }
}
