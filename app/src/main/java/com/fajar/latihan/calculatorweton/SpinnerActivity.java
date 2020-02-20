package com.fajar.latihan.calculatorweton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //create spinnerday view
        Spinner spinner = findViewById(R.id.new_spinner);
        Button button = findViewById(R.id.submit);

        spinner.setOnItemSelectedListener(this);

        //create adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinnerday, R.layout.support_simple_spinner_dropdown_item);

        //show spinnerday menu
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        //set adapter to spinnerday
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
