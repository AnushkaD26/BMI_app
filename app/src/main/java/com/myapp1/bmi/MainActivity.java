package com.myapp1.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtHeightFt,edtHeightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llmain;



        edtWeight=findViewById(R.id.edtWeight);
        edtHeightFt=findViewById(R.id.edtHeightFt);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult=findViewById(R.id.txtResult);
        llmain=findViewById(R.id.llmain);






        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {


                int wt=Integer.parseInt(edtWeight.getText().toString());
                int ft=Integer.parseInt(edtHeightFt.getText().toString());
                int in=Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn=ft*12+in;
                double totalCm=totalIn*2.53;
                double totalm=totalCm/100;
                double bmi=(wt/(totalm*totalm));


                if(bmi>25){
                    txtResult.setText("You are over weight!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.red));

                }
                else if(bmi<18) {
                    txtResult.setText("You are under weight!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.yellow));



                }
                else if(bmi==18) {
                    txtResult.setText("On the Border!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.teal_200));
                }
                else{
                    txtResult.setText("You are Healthy!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.green));


                }
            }
        });

    }
}