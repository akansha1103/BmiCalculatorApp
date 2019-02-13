package com.megrisoft.android.bmicalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ANDROID on 11/21/2016.
 */
public class MainScreen extends Activity {

    String str_name;
    String str_email;
    String str_weight;
    String str_height;
    String str_age;
    String str_gender;

    private EditText editName,editEmail,editWeight,editHeight,editAge;
    private Spinner spinnerGender;
    private Button btnSubmit;
    private TextView textResult;

    Double calculated_bmi;
    Double height_cm;
    Double height_mt;

    Double calculated_height;
    Double weight_kg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        editName = (EditText)findViewById(R.id.editName);
        editEmail = (EditText)findViewById(R.id.editEmail);
        editWeight = (EditText)findViewById(R.id.editWeight);
        editHeight = (EditText)findViewById(R.id.editHeight);
        editAge = (EditText)findViewById(R.id.editAge);
        spinnerGender = (Spinner)findViewById(R.id.spinnerGender);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        textResult= (TextView)findViewById(R.id.textResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_name = editName.getText().toString();
                str_email = editEmail.getText().toString();
                str_weight = editWeight.getText().toString();
                str_height = editHeight.getText().toString();
                str_age = editAge.getText().toString();
                str_gender = spinnerGender.getSelectedItem().toString();


                if (str_name.length() == 0 ) {
                    Toast.makeText(getApplicationContext(), "Enter  Name..!", Toast.LENGTH_LONG).show();
                }
                else if (str_email.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter EName..!",Toast.LENGTH_LONG).show();
                }
                else if (str_weight.length() == 0 ) {
                    Toast.makeText(getApplicationContext(), "Enter weight..!",Toast.LENGTH_LONG).show();
                }
                else if (str_height.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter Height..!",Toast.LENGTH_LONG).show();
                }


                else {

                    //Toast.makeText(getApplicationContext(), "Register Successfully...!",Toast.LENGTH_LONG).show();
                    editName.setText("");
                    editEmail.setText("");
                    editWeight.setText("");
                    editHeight.setText("");
                    editAge.setText("");

                    weight_kg = Double.parseDouble(str_weight);
                    height_cm = Double.parseDouble(str_height);
                    height_mt = height_cm/100;
                    calculated_height =(height_mt*height_mt);
                    calculated_bmi = weight_kg/calculated_height;
                    textResult.setText(Double.toString(calculated_bmi));
                    if (calculated_bmi >= 1 && calculated_bmi <= 12)
                    {

                        Toast.makeText(getApplicationContext(),"Severe Thinness",Toast.LENGTH_SHORT).show();
                    }




                    Intent detailIntent = new Intent(MainScreen.this,DetailScreen.class);
                    detailIntent.putExtra("name", str_name);
                   detailIntent.putExtra("email",str_email);
                    detailIntent.putExtra("weight",str_weight);
                   detailIntent.putExtra("height",str_height);
                    detailIntent.putExtra("age",str_age);
                   detailIntent.putExtra("gender",str_gender);
                    detailIntent.putExtra("result",calculated_bmi);
                    startActivity(detailIntent);
                }

            }
        });
    }
}
