package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnOK2;
    TextView txt;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = (TextView) findViewById(R.id.txtView);
        btnOK2 = (Button) findViewById(R.id.btnOK2);
        name = (EditText) findViewById(R.id.txtName);
        btnOK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Welcome " + name.getText().toString());
                txt.setTextColor(Color.GREEN);
            }
        });
    }
}