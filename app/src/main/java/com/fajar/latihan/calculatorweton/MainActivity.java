package com.fajar.latihan.calculatorweton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner, spinner2, spinner3, spinner4;
    //private int number;
    int getSpinnerPosition;
    private EditText name_user, name_doi;

    //private SpinnerActivity spinnerActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Spinner spinner = findViewById(R.id.new_spinner);
        Button button = findViewById(R.id.submit);
        name_user = findViewById(R.id.name);
        name_doi = findViewById(R.id.pasangan);

        //spinner.setOnItemSelectedListener(this);

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
                    /*//Intent moveToResult = new Intent(MainActivity.this, ResultAcitivity.class);
                    //moveToResult.putExtra("move", nama);
                    //moveToResult.putExtra(ResultAcitivity.EXTRA_NAME, nama);
                    //startActivity(moveToResult);

                    TextView resultan = findViewById(R.id.tv_result);
                    String nameUser = name_user.getText().toString();
                    String nameDoi = name_doi.getText().toString();
                    String neww = "Halo " + nameUser + ", Kamu dan " + nameDoi + " Cocok.. SELAMAT";
                    resultan.setText(neww);*/

                    switch (getSpinnerPosition) {
                        case 1:

                            break;
                    }

                    hitungWeton();

                    //String resultWeton = "HOLAAAAAAAAAAAA";
                    //TextView viewStringOfSpinner = findViewById(R.id.tv_spinner1_result);
                    //viewStringOfSpinner.setText(resultWeton);
                }
            }
        });

    }

    private void hitungWeton() {
        int value1 = spinner.getSelectedItemPosition() + 1;
        int value2 = spinner2.getSelectedItemPosition() + 1;
        int value3 = spinner3.getSelectedItemPosition() + 1;
        int value4 = spinner4.getSelectedItemPosition() + 1;

        int patokan1 = value1 + value2;
        int patokan2 = value3 + value4;

        int resultPatokan = patokan1 + patokan2;

        char hasilnya[] = {10, 19, 28, 37};


        if (resultPatokan == 10 || resultPatokan == 19 || resultPatokan == 28 || resultPatokan == 37) {
            String nameUser = name_user.getText().toString();
            String nameDoi = name_doi.getText().toString();

            TextView hasilPatokan = findViewById(R.id.tv_spinner1_result);

            hasilPatokan.setText(getString(R.string.tinari));
        } else {
            TextView hasilPatokan = findViewById(R.id.tv_spinner1_result);
            hasilPatokan.setText("Salah");
        }

        /*String qwqww = String.valueOf(value1);
        TextView viewHasil = findViewById(R.id.tv_spinner1_result);
        viewHasil.setText(qwqww);*/
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //this.number = position + 1;
        getSpinnerPosition = position + 1;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
