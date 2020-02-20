package com.fajar.latihan.calculatorweton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultAcitivity extends Activity {

    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //TextView result = findViewById(R.id.tv_result);
        Intent result = getIntent();


        TextView hasil = findViewById(R.id.tv_result);
        //hasil.setText(getIntent().getStringExtra("move"));

        String haha = getIntent().getStringExtra(EXTRA_NAME);
        String hihii = "ini " + haha;
        hasil.setText(hihii);
    }
}
