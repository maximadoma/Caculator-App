package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.mariuszgromada.math.mxparser.Expression;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers();
        operators();
        misc_btn();

        input = findViewById(R.id.textfield_bottom);
        input.setShowSoftInputOnFocus(false);

        answer = findViewById(R.id.textfield_answer);
        answer.setShowSoftInputOnFocus(false);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(input.getText().toString())){
                    input.setText("");
                }
            }
        });


    }


    public void numbers(){
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

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

    }

    public void operators(){
        MaterialButton btn_plus = (MaterialButton) findViewById(R.id.addition);
        MaterialButton btn_minus = (MaterialButton) findViewById(R.id.subtraction);
        MaterialButton btn_multiply = (MaterialButton) findViewById(R.id.multiplication);
        MaterialButton btn_divide = (MaterialButton) findViewById(R.id.division);

        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);

    }

    public void misc_btn(){
        MaterialButton btn_allClear = (MaterialButton) findViewById(R.id.all_clear);
        MaterialButton btn_backSpace = (MaterialButton) findViewById(R.id.delete);
        MaterialButton btn_parenthesis = (MaterialButton) findViewById(R.id.parenthesis);
        MaterialButton btn_dot = (MaterialButton) findViewById(R.id.dot);
        MaterialButton btn_equals = (MaterialButton) findViewById(R.id.equals);
        MaterialButton btn_modulo = (MaterialButton) findViewById(R.id.modulo);

        btn_allClear.setOnClickListener(this);
        btn_backSpace.setOnClickListener(this);
        btn_parenthesis.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_modulo.setOnClickListener(this);
    }


    private void updateText(String strToAdd){
        String oldString = input.getText().toString();
        int cursorPosition = input.getSelectionStart();
        String leftString = oldString.substring(0, cursorPosition);
        String rightString = oldString.substring(cursorPosition);

        if (getString(R.string.display).equals(input.getText().toString())){
            input.setText(strToAdd);
            input.setSelection(cursorPosition + 1);
        }else{
            input.setText(String.format("%s%s%s", leftString, strToAdd, rightString));
            input.setSelection(cursorPosition + 1);
        }

    }


    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.zero) {
            zero_btn(v);

        }
        else if (v.getId() == R.id.one) {
            one_btn(v);
        }
        else if (v.getId() == R.id.two) {
            two_btn(v);
        }
        else if (v.getId() == R.id.three) {
            three_btn(v);
        }

        else if (v.getId() == R.id.four) {
            four_btn(v);
        }

        else if (v.getId() == R.id.five) {
            five_btn(v);
        }

        else if (v.getId() == R.id.six) {
            six_btn(v);
        }

        else if (v.getId() == R.id.seven) {
            seven_btn(v);
        }

        else if (v.getId() == R.id.eight) {
            eight_btn(v);
        }

        else if (v.getId() == R.id.nine) {
            nine_btn(v);
        }

        else if (v.getId() == R.id.addition) {
            plus_btn(v);
        }
        else if (v.getId() == R.id.subtraction) {
            minus_btn(v);
        }
        else if (v.getId() == R.id.multiplication) {
            multiply_btn(v);
        }
        else if (v.getId() == R.id.division) {
            divide_btn(v);
        }
        else if (v.getId() == R.id.all_clear) {
            allClear_btn(v);
        }
        else if (v.getId() == R.id.delete) {
            backSpace_btn(v);
        }
        else if (v.getId() == R.id.parenthesis) {
            parenthesis_btn(v);
        }
        else if (v.getId() == R.id.dot) {
            dot_btn(v);
        }
        else if (v.getId() == R.id.equals) {
            equals_btn(v);
        }
        else if (v.getId() == R.id.modulo){
            modulo_btn(v);
        }
    }

    public void dot_btn(View view){
        updateText(".");
    }
    public void zero_btn(View view){
        updateText("0");
    }

    public void one_btn(View view){
        updateText("1");
    }

    public void two_btn(View view){
        updateText("2");
    }

    public void three_btn(View view){
        updateText("3");
    }

    public void four_btn(View view){
        updateText("4");
    }

    public void five_btn(View view){
        updateText("5");
    }

    public void six_btn(View view){
        updateText("6");
    }

    public void seven_btn(View view){
        updateText("7");
    }

    public void eight_btn(View view){
        updateText("8");
    }
    public void nine_btn(View view){
        updateText("9");
    }

    public void plus_btn(View view){
        updateText("+");
    }

    public void minus_btn(View view){
        updateText("-");
    }

    public void multiply_btn(View view){
        updateText("*");
    }

    public void divide_btn(View view){
        updateText("/");
    }

    public void allClear_btn(View view){
        input.setText("");
    }

    public void modulo_btn(View view){
        updateText("%");
    }


    public void backSpace_btn(View view){
        int cursorPosition = input.getSelectionStart();
        int textLength = input.getText().length();

        if (cursorPosition != 0 && textLength != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) input.getText();
            selection.replace(cursorPosition - 1, cursorPosition, "");
            input.setText(selection);
            input.setSelection(cursorPosition - 1);
        }
    }


    public void parenthesis_btn(View view){
        int cursorPosition = input.getSelectionStart();
        int openParenthesis = 0;
        int closeParenthesis = 0;
        int textLength = input.getText().length();

        for (int i = 0; i < cursorPosition; i++){
            if (input.getText().toString().substring(i, i+1).equals("(")){
                openParenthesis +=1;
            }
            if (input.getText().toString().substring(i, i+1).equals(")")){
                closeParenthesis +=1;
            }
        }

        if(openParenthesis == closeParenthesis || input.getText().toString().substring(textLength - 1, textLength).equals("(")){
            updateText("(");
        }

        else if(closeParenthesis < openParenthesis && !input.getText().toString().substring(textLength - 1, textLength).equals("(")){
            updateText(")");
        }
            input.setSelection(cursorPosition + 1);
    }

    public void equals_btn(View view){
        String userExp = input.getText().toString();

        userExp = userExp.replaceAll("÷", "/");
        userExp = userExp.replaceAll("×", "*");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        if (result.endsWith(".0")){
            result =result.replace(".0", "");
            input.setText(result);
        } else{
            input.setText(result);
        }

        input.setSelection(result.length());

    }


}