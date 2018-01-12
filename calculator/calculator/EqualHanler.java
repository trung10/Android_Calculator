package com.example.trung.calculator.calculator;

import android.widget.TextView;

import com.example.trung.calculator.MainActivity;


public class EqualHanler implements Handler{

    @Override
    public void handlerIt(Object... parameters) {
        MainActivity mainActivity = (MainActivity) parameters[0];

        //String numberText = (String) parameters[1];
        TextView inputText = (TextView) parameters[2];

        mainActivity.txtvNumber = inputText.getText().toString();
        //numberText = inputText.getText().toString();

        inputText.setText(inputText.getText().toString());
    }
}
