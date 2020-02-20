package com.fajar.latihan.calculatorweton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner, spinner2, spinner3, spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.submit);

        //create spinnerday view
        spinner = findViewById(R.id.spinner_days);
        spinner.setOnItemSelectedListener(this);

        //create adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinnerday, R.layout.support_simple_spinner_dropdown_item);

        //show spinnerday menu
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        //set adapter to spinnerday
        spinner.setAdapter(adapter);


        spinner2 = findViewById(R.id.spinner_jawa);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_pasaran, R.layout.support_simple_spinner_dropdown_item);

        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner2.setAdapter(adapter2);


        ///
        spinner3 = findViewById(R.id.spinner_days2);
        spinner3.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.spinnerday, R.layout.support_simple_spinner_dropdown_item);

        adapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner3.setAdapter(adapter3);


        ///
        spinner4 = findViewById(R.id.spinner_jawa2);
        spinner4.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.spinner_pasaran, R.layout.support_simple_spinner_dropdown_item);

        adapter4.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner4.setAdapter(adapter4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.submit) {
                    calculateWeton();
                }
            }
        });
    }

    private void calculateWeton() {
        int value1 = spinner.getSelectedItemPosition() + 3;
        int value2 = spinner2.getSelectedItemPosition() + 4;
        int value3 = spinner3.getSelectedItemPosition() + 3;
        int value4 = spinner4.getSelectedItemPosition() + 4;

        int patokan1 = value1 + value2;
        int patokan2 = value3 + value4;


        int resultPatokan = patokan1 + patokan2;

        TextView resultsPatokan = findViewById(R.id.tv_spinner1_result);

        if (resultPatokan == 1 || resultPatokan == 9 || resultPatokan == 10 || resultPatokan == 18 || resultPatokan == 19
                || resultPatokan == 27 || resultPatokan == 28 || resultPatokan == 36) {
            resultsPatokan.setText(getString(R.string.pegat));
        } else if (resultPatokan == 2 || resultPatokan == 11 || resultPatokan == 20 || resultPatokan == 29) {
            resultsPatokan.setText(getString(R.string.ratu));
        } else if (resultPatokan == 3 || resultPatokan == 12 || resultPatokan == 21 || resultPatokan == 30) {
            resultsPatokan.setText(getString(R.string.jodoh));
        } else if (resultPatokan == 4 || resultPatokan == 13 || resultPatokan == 22 || resultPatokan == 31) {
            resultsPatokan.setText(R.string.topo);
        } else if (resultPatokan == 5 || resultPatokan == 14 || resultPatokan == 23 || resultPatokan == 32) {
            resultsPatokan.setText(R.string.tinari);
        } else if (resultPatokan == 6 || resultPatokan == 15 || resultPatokan == 24 || resultPatokan == 33) {
            resultsPatokan.setText(R.string.padu);
        } else if (resultPatokan == 7 || resultPatokan == 16 || resultPatokan == 25 || resultPatokan == 34) {
            resultsPatokan.setText(R.string.sujanan);
        } else {
            resultsPatokan.setText(R.string.pesthi);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
