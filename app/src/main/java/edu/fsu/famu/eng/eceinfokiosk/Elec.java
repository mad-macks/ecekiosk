package edu.fsu.famu.eng.eceinfokiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Elec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);
    }

    //go to page for andrei
    public void viewAndrei(View view) {
        //call new activity
        Intent intent = new Intent(this,Andrei.class);
        startActivity(intent);
    }

    //go to page for foo
    public void viewFoo(View view) {
        //call new activity
        Intent intent = new Intent(this,Foo.class);
        startActivity(intent);
    }

    //go to page for harvey
    public void viewHarvey(View view) {
        //call new activity
        Intent intent = new Intent(this,Harvey.class);
        startActivity(intent);
    }

    //go to page for hooker
    public void viewHooker(View view) {
        //call new activity
        Intent intent = new Intent(this,hooker.class);
        startActivity(intent);
    }


    //go back to faculty page
    public void viewFaculty(View view) {
        //call new activity
        Intent intent = new Intent(this, FacultyMenu.class);
        startActivity(intent);
    }
}
