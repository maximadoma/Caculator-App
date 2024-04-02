package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  TextView input;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btn_0 = (MaterialButton) findViewById(R.id.zero);
        btn_0.setOnClickListener(this);





    }


    public void Numbers(View v){
        MaterialButton btn_0 = (MaterialButton) findViewById(R.id.zero);
        MaterialButton btn_1 = (MaterialButton) findViewById(R.id.one);
        MaterialButton btn_2 = (MaterialButton) findViewById(R.id.two);
        MaterialButton btn_3 = (MaterialButton) findViewById(R.id.three);
        MaterialButton btn_4 = (MaterialButton) findViewById(R.id.four);
        MaterialButton btn_5 = (MaterialButton) findViewById(R.id.five);
        MaterialButton btn_6 = (MaterialButton) findViewById(R.id.six);
        MaterialButton btn_7 = (MaterialButton) findViewById(R.id.seven);
        MaterialButton btn_8 = (MaterialButton) findViewById(R.id.eight);
        MaterialButton btn_9 = (MaterialButton) findViewById(R.id.nine);

    }


    @Override
    public void onClick(View v) {
       input = findViewById(R.id.textfield_bottom);
//       number = input.setText();


        if (v.getId() == R.id.zero) {
            number = 0;
            input.setText(number);
        }
        else if (v.getId() == R.id.one) {
            input.setText("1");
        }
        else if (v.getId() == R.id.two) {
            input.setText("2");
        }
    }
}