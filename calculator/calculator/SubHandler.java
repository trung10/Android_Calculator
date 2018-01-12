package com.example.trung.calculator.calculator;

import android.widget.TextView;

import com.example.trung.calculator.MainActivity;

public class SubHandler implements Handler{

    private double value1;
    private double value2;
    private double result;
    private String resultString;

    @Override
    public void handlerIt(Object... parameters) {
        MainActivity mainActivity = (MainActivity) parameters[0];
        String value = (String) parameters[1];
        TextView inputText = (TextView) parameters[2];

        value1 = Double.valueOf(value.replace(",", "").trim());
        value2 = Double.valueOf(inputText.getText().toString().replace(",", "").trim());

        result = value1 - value2;

        resultString = String.valueOf(result);

        mainActivity.txtvNumber = resultString;

        inputText.setText(resultString);
    }
}
