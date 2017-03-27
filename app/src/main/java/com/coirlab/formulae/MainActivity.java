package com.coirlab.formulae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formula_name_list);
    }

    public void populate_frequency(View freq_view) {
        setContentView(R.layout.single_formula_view);
    }

    public void populate_voltage(View volt_view) {
        setContentView(R.layout.single_formula_view);
    }

    public void populate_power(View power_view) {
        setContentView(R.layout.single_formula_view);
    }

    public void populate_power_volt(View power_volt_view) {
        setContentView(R.layout.single_formula_view);
    }

    public void populate_power_current(View power_current_view) {
        setContentView(R.layout.single_formula_view);
    }
}
