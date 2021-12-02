package com.anjani.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edFirstValue, edSecondValue;
    TextView tvAns;
    Button add, subtract , multiply, divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edFirstValue = findViewById(R.id.edFirstValue);
        edSecondValue = findViewById(R.id.edSecondValue);

        tvAns = findViewById(R.id.tvAns);

       add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
       divide = findViewById(R.id.btnDevide);

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int firstvalue, secondvalue, ans;

               firstvalue = Integer.parseInt(edFirstValue.getText().toString());
               secondvalue = Integer.parseInt(edSecondValue.getText().toString());

               ans = firstvalue + secondvalue;

               tvAns.setText(" Answer is = "+ans);


           }
       });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(edFirstValue.getText().toString());
                secondvalue = Integer.parseInt(edSecondValue.getText().toString());

                ans = firstvalue - secondvalue;

                tvAns.setText(" Answer is = "+ans);


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(edFirstValue.getText().toString());
                secondvalue = Integer.parseInt(edSecondValue.getText().toString());

                ans = firstvalue * secondvalue;

                tvAns.setText(" Answer is = "+ans);


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstvalue, secondvalue, ans;

                firstvalue = Float.parseFloat(edFirstValue.getText().toString());
                secondvalue = Float.parseFloat(edSecondValue.getText().toString());

                ans = firstvalue / secondvalue;

                tvAns.setText(" Answer is = "+ans);


            }
        });

    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK,new Intent().putExtra("exit",true));
    super.onBackPressed();
    }
}