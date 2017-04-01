package com.coirlab.formulae;

import android.content.Intent;
import android.support.annotation.ArrayRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formula_name_list);
    }

    public  void populate_single_formula(@StringRes int string_id) {
        Intent intent = new Intent(this, FormulaActivity.class);
        intent.putExtra("id", string_id);
        startActivity(intent);

    }
    public void populate_frequency(View freq_view) {
        populate_single_formula(R.string.frequency);
    }

    public void populate_voltage(View volt_view) {
        populate_single_formula(R.string.voltage);
    }

    public void populate_power(View power_view) {;
        populate_single_formula(R.string.power);
    }

    public void populate_power_volt(View power_volt_view) {
        populate_single_formula(R.string.power_voltage);
    }

    public void populate_power_current(View power_current_view) {
        populate_single_formula(R.string.power_current);
    }
}
