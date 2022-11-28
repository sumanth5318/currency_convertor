package com.example.currency_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText cadet;
    EditText usdet;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cadet = findViewById(R.id.et_cad);
        usdet = findViewById(R.id.et_usd);
    }

    public void calculatebmi(View view) {
        String cad = cadet.getText().toString();
        String usd = usdet.getText().toString();
        if ((!cad.isEmpty() && !usd.isEmpty())||(cad.isEmpty() && usd.isEmpty())) {
            Toast.makeText(this, "Enter currency", Toast.LENGTH_SHORT).show();
        } else if (!cad.isEmpty()) {
            double temp = (Double.parseDouble(cad) * 0.75);
            usdet.setText(""+temp);
        } else if(!usd.isEmpty()) {
            double temp = (Double.parseDouble(usd) * 1.34);
            cadet.setText(""+temp);
        }
    }
}
