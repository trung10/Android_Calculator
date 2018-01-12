package com.example.trung.calculator.calculator;

import android.content.Intent;
import android.widget.TextView;

import com.example.trung.calculator.MainActivity;

public class AddHandler implements Handler{

    private double value1;
    private double value2;
    private double result;
    private String resultString;

    @Override
    public void handlerIt(Object... parameters) {

        //pull the CalculatorActivity from the Calculator class and assigns to activity
        //MainActivity activity = (MainActivity) parameters[0];
        //declare Textviews from textViews pass from Calculator
        MainActivity mainActivity = (MainActivity) parameters[0];
        String number = (String) parameters[1];
        TextView txtInput = (TextView) parameters[2];
        if (!number.equalsIgnoreCase("")){
            value1 = Double.parseDouble(txtInput.getText().toString().replace(",", ""));
            value2 = Double.parseDouble(number.replace(",", "").trim());
            result = value1 + value2;

            if (isInt(result)){
                resultString = Integer.toString((int)result);
            } else {
                resultString = Double.toString(result);
            }
            txtInput.setText(String.format("%,d", (int) result));
        }
        mainActivity.txtvNumber = resultString;
    }

    private boolean isInt(double a){
        a -= (int) a;
        return  a == 0 ? true : false;
    }
}
