package com.example.w0178837.fragdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectFrag(findViewById(R.id.button1));

    }

    public void selectFrag(View view){
        // declare a fragment
        Fragment fr;
        // select the appropriate fragment
        if(view == findViewById(R.id.button2)){
            fr = new FragmentTwo();
        }else{
            fr = new FragmentOne();
        }

        // create a new FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a fragment transaction object using the fragment manager
        FragmentTransaction ft = fm.beginTransaction();
        // now place the appropriate fragment into the fragment_place on activity_main
        ft.replace(R.id.fragment_place, fr);
        ft.commit();

    } // end selectFrag
}// end MainActivity
