package com.example.trung.calculator.calculator;

import android.widget.TextView;

import com.example.trung.calculator.MainActivity;

/**
 * Created by trung on 11/20/17.
 */

public class DivideHandler implements  Handler{

    private double value1;
    private double value2;
    private double result;
    private String resultString;

    @Override
    public void handlerIt(Object... parameters) {
        MainActivity mainActivity = (MainActivity) parameters[0];
        String value = (String) parameters[1];
        TextView textView = (TextView) parameters[2];

        value1 = Double.valueOf(value.replace(",","").toString().trim());
        value2 = Double.valueOf(textView.getText().toString().replace(",","").trim());

        result = value1 / value2;

        resultString = Double.toString(result);

        textView.setText(resultString);
        mainActivity.txtvNumber = resultString;
    }
}
