package com.example.trung.calculator.calculator.formatString;

/**
 * Created by trung on 12/31/17.
 */

public class Handler {
    public static String addCommaSeparator(int number){
        return String.format("%,d", number);
    }
}
