package com.example.trung.calculator.calculator;

import android.util.Log;
import android.widget.TextView;


public class NumberValueHandler implements Handler {

    @Override
    public void handlerIt(Object... parameters) {
        String numberString = (String) parameters[0];

        TextView textView = (TextView) parameters[1];

        String flag = (String) parameters[2];

        if (flag.equalsIgnoreCase("1")){
            textView.setText("");
        }
        String number = textView.getText().toString().trim();

        number = number.equalsIgnoreCase("0") ? numberString : number.concat(numberString);

        //textView.setText(convertcomma(Double.parseDouble(number.replace(",", ""))));
        textView.setText(number);
    }

    private String convertcomma(Double number){
        //Log.d("so chuyen vao", "convertcomma: " + number);
        int temp = 0;
        int soPT = demKyTuTrongSo(number.intValue());
        //Log.d("so pt truoc", "convertcomma: " + soPT);
        String s = String.valueOf(number.intValue());

        if (soPT > 3) {
            s = "";
            do {
                if (soPT > 3) {
                    temp = (int)(number % 1000);
                    s = "," + temp + s;
                    //Log.d("s", "convertcomma: " + s);
                    soPT -= 3;
                    number /= 1000;
                    //Log.d("so khi vua thay doi", "" + number);
                    //Log.d("so pt", "convertcomma: " + soPT);
                }
            } while (soPT > 3);
            s = number.intValue() + s;
        }
        return s;
    }
    private int demKyTuTrongSo(int number){
        //Log.d("spt", "demKyTuTrongSo: " + number);
        int dem = 0;
        do {
            number /= 10;
            dem++;
        }while (number > 0);
        return  dem;
    }
}
