package com.tjah.sampleapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        this.setTitle("My Profile");


        ActionBar ab = getSupportActionBar();
        //  ab.setTitle(Html.fromHtml("<font color=#ffffff>" + "Contact a Doctor" + "</font>"));
        //ab.setIcon(getResources().getDrawable(R.drawable.ic_action_back));
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

}
