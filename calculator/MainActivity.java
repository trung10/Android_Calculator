package com.example.trung.calculator;

import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.example.trung.calculator.calculator.ApplicationController;
import com.example.trung.calculator.calculator.NumberValueHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_0) Button mbtn_0;
    @BindView(R.id.btn_1) Button mbtn_1;
    @BindView(R.id.btn_2) Button mbtn_2;
    @BindView(R.id.btn_3) Button mbtn_3;
    @BindView(R.id.btn_4) Button mbtn_4;
    @BindView(R.id.btn_5) Button mbtn_5;
    @BindView(R.id.btn_7) Button mbtn_7;
    @BindView(R.id.btn_6) Button mbtn_6;
    @BindView(R.id.btn_8) Button mbtn_8;
    @BindView(R.id.btn_9) Button mbtn_9;
    @BindView(R.id.btn_ac) Button mbtn_ac;
    @BindView(R.id.btn_add) Button mbtn_add;
    @BindView(R.id.btn_comma) Button mbtn_comma;
    @BindView(R.id.btn_division) Button mbtn_division;
    @BindView(R.id.btn_equal) Button mbtn_equal;
    @BindView(R.id.btn_multiplication) Button mbtn_multiplication;
    @BindView(R.id.btn_percent) Button mbtn_percent;
    @BindView(R.id.btn_sub) Button mbtn_sub;
    @BindView(R.id.btn_unsigned) Button mbtn_unsigned;
    @BindView(R.id.txtv_result)
    TextView mtxtv_result;

    private MainActivity activity;
    protected String command;
    protected String opperand;
    protected String numKey;
    protected String btnNumber;
    public String txtvNumber;
    protected String flag;
    private  String TAG = "is error";
    protected int counter;
    //data binding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        command = "=";
        opperand = "";
        numKey = "numKey";
        activity = this;
        txtvNumber = "";
        flag = "0";

        mbtn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = "0";
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = "1";
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_2.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_3.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_4.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_5.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_6.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_7.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_8.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNumber = mbtn_9.getText().toString().trim();
                ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opperand = mbtn_add.getText().toString().trim();
                ApplicationController.handleRequest(command, activity,txtvNumber, mtxtv_result);
                command = opperand;
                //txtvNumber = mtxtv_result.getText().toString().trim();
                flag = "1";
            }
        });

        mbtn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvNumber = "";
                mbtn_ac.setText("AC");
                mtxtv_result.setText("0");

                command = "=";
                opperand = "=";
            }
        });

        mbtn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opperand = mbtn_sub.getText().toString();
                ApplicationController.handleRequest(command, activity, txtvNumber, mtxtv_result);
                command = opperand;
                flag = "1";
            }
        });

        mbtn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opperand = mbtn_multiplication.getText().toString();
                ApplicationController.handleRequest(command, activity, txtvNumber, mtxtv_result);
                command = opperand;
                flag = "1";
            }
        });

        mbtn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opperand = mbtn_division.getText().toString();
                ApplicationController.handleRequest(command, activity, txtvNumber, mtxtv_result);
                command = opperand;
                flag = "1";
            }
        });

        mbtn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationController.handleRequest("%", activity, txtvNumber, mtxtv_result);
                flag = "1";
            }
        });

        mbtn_unsigned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ApplicationController.handleRequest("+/-", mtxtv_result);
                flag = "0";
                mbtn_ac.setText("C");
            }
        });

        mbtn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opperand = mbtn_equal.getText().toString();
                ApplicationController.handleRequest(command, activity,  txtvNumber, mtxtv_result);
                command = opperand;
            }
        });

        mbtn_comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String InputText = mtxtv_result.getText().toString();
                counter = InputText.indexOf(".");

                if(counter == -1){

                    btnNumber = mbtn_comma.getText().toString();
                    ApplicationController.handleRequest(numKey, btnNumber, mtxtv_result, flag);
                }
            }
        });
    }
    private String convertcomma(double number){
        int temp = 0;
        int soPT = demKyTuTrongSo(number);
        String s = "";
        if (soPT > 3) {
            for (int i = 0; i <= soPT; i++) {
                temp = (int) (number - number / 1000);
                s += String.valueOf(temp);
                number /= 100;
                soPT = demKyTuTrongSo(number);
            }
        }
        return s;
    }
    private int demKyTuTrongSo(double number){
        int dem = 0;
        do {
            number = number/10;
            dem++;
        }while (number > 0);
        return  dem;
    }
}
