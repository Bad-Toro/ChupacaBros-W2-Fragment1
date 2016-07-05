package com.mac.training.ff1;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//implements BlankFragment.OnFragmentInteractionListener
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//A comment
        BlankFragment bF = new BlankFragment();

        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.mFrame, bF);
        ft.commit();
    }
//
//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
}
