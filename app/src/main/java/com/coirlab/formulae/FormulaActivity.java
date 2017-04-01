package com.coirlab.formulae;

import android.os.Bundle;
import android.support.annotation.ArrayRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Dinesh on 01-04-2017.
 */
public class FormulaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Dinesh child activity", "");
        //setContentView(R.layout.single_formula_view);
        @StringRes int str_id = getIntent().getExtras().getInt("id");

        String formula;
        Spinner formula_fields;
        TextView formula_view;
        @ArrayRes int array_id=0;

        setContentView(R.layout.single_formula_view);
        switch(str_id) {
            case R.string.frequency:
                array_id = R.array.frequency;
                break;
            case R.string.voltage:
                array_id = R.array.voltage;
                break;
            case R.string.power:
                array_id = R.array.power;
                break;
            case R.string.power_voltage:
                array_id = R.array.power_voltage;
                break;
            case R.string.power_current:
                array_id = R.array.power_current;
                break;
            default:
                //logs
                break;
        }

        //set formula drop down
        formula_fields = (Spinner)findViewById(R.id.formula_fields);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                array_id, R.layout.spinner_layout);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        formula_fields.setAdapter(adapter);

        //Set Formula
        formula = getString(str_id);
        formula_view = (TextView) findViewById(R.id.single_formula_view);
        formula_view.setText(formula);
    }
}
