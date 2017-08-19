package com.example.aderelemaryidowu.contactus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.aderelemaryidowu.contactus.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutUs(View view)
    {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}
