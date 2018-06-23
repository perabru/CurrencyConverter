package com.brunoperabru.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    public void convertValue(View view) {

        DecimalFormat df = new DecimalFormat("#.##");
        double real = 3.78560;
        double resultado = 0;
        EditText edtConvert = (EditText) findViewById(R.id.edtConvert);
        double dollar = Double.parseDouble(edtConvert.getText().toString());
        resultado = dollar * real;

        Toast.makeText(getApplicationContext(), "R$ " + String.valueOf(df.format(resultado)), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
