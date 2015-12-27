package com.example.kimhuang.splashscreen;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       tvHello = (TextView)findViewById(R.id.tvHello);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/sukhumvit.ttf");
        tvHello.setTypeface(tf);

    }
}
