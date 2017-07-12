package com.example.a1.freeviewdemocircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CustomCircleView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomView = (CustomCircleView) findViewById(R.id.ccv_main);
        new Thread(mCustomView).start();


    }
}
