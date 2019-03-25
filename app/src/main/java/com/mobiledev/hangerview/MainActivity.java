package com.mobiledev.hangerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements HangerView.OnLayoutListener {

    private HangerView hangerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hangerView = findViewById(R.id.activity_main_hanger_view);
        hangerView.setOnLayoutListener(this);
    }

    @Override
    public void onLayout() {
        hangerView.setCardColor(R.color.colorPrimary);
    }
}