package com.megrisoft.android.bmicalculator;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by ANDROID on 11/23/2016.
 */
public class DetailScreen extends Activity {

    private TextView textName, textEmail, textWeight, textHeight, textAge, textGender,textResultBMI,textResultBMIMessage;
    private ImageView imageViewVectorBMI;
    private Button buttonTips,buttonExit;

    double e1;
    int age;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);

        textName = (TextView) findViewById(R.id.textName);
        textEmail = (TextView) findViewById(R.id.textEmail);
        textWeight = (TextView) findViewById(R.id.textWeight);
        textHeight = (TextView) findViewById(R.id.textHeight);
        textAge = (TextView) findViewById(R.id.textAge);
        textGender = (TextView) findViewById(R.id.textGender);
        imageViewVectorBMI = (ImageView)findViewById(R.id.imageViewVectorBMI);
        textResultBMI = (TextView) findViewById(R.id.textResultBMI);
        textResultBMIMessage = (TextView)findViewById(R.id.textResultBMIMessage);
        buttonTips= (Button)findViewById(R.id.buttonTips);
        buttonExit = (Button)findViewById(R.id.buttonExit);

        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            String j_name = (String) b.get("name");
            textName.setText(j_name);
            String j_email = (String) b.get("email");
            textEmail.setText(j_email);
            String j_weight = (String) b.get("weight");
            textWeight.setText(j_weight);
            String j_height = (String) b.get("height");
            textHeight.setText(j_height);
            String j_age = (String) b.get("age");
            textAge.setText(j_age);
            String j_gender = (String) b.get("gender");
            textGender.setText(j_gender);
//            String j_result_bmi =(String) b.get("result");
//            textResultBMI.setText(j_result_bmi);
            e1 = b.getDouble("result");
            age = Integer.valueOf(j_age);
            if (age >= 0 && age < 10) {
                if (e1 >= 0 && e1 < 12) {

                    //Toast.makeText(getApplicationContext(), "body_severe_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Severe Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_severe_img);

                }
                if (e1 >= 12 && e1 < 14) {

                    //  Toast.makeText(getApplicationContext(), "body_thiness_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_thiness_img);

                }
                if (e1 >= 14 && e1 < 17) {

                    // Toast.makeText(getApplicationContext(), "body_normal_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Normal");
                    imageViewVectorBMI.setImageResource(R.drawable.body_normal_img);

                }

                if (e1 >= 17 && e1 < 19) {

                    // Toast.makeText(getApplicationContext(), "body_over_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Over Weight");
                    imageViewVectorBMI.setImageResource(R.drawable.body_over_img);

                }
                if (e1 >= 19 && e1 <= 100) {

                    // Toast.makeText(getApplicationContext(), "body_zerobese_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: O Bese");
                    imageViewVectorBMI.setImageResource(R.drawable.body_zerobese_img);

                }
                DecimalFormat df = new DecimalFormat("#.##");
                e1 = Double.valueOf(df.format(e1));
                textResultBMI.setText(Double.toString(e1));


            }
            if (age >= 10 && age < 15)
            {
                if (e1 >= 0 && e1 < 16) {

                    //Toast.makeText(getApplicationContext(), "body_severe_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Severe Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_severe_img);

                }
                if (e1 >= 16 && e1 < 18) {

                    //  Toast.makeText(getApplicationContext(), "body_thiness_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_thiness_img);

                }
                if (e1 >= 18 && e1 < 23) {

                    // Toast.makeText(getApplicationContext(), "body_normal_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Normal");
                    imageViewVectorBMI.setImageResource(R.drawable.body_normal_img);

                }

                if (e1 >= 23 && e1 < 28) {

                    // Toast.makeText(getApplicationContext(), "body_over_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Over Weight");
                    imageViewVectorBMI.setImageResource(R.drawable.body_over_img);

                }
                if (e1 >= 28 && e1 <= 100) {

                    // Toast.makeText(getApplicationContext(), "body_zerobese_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: O Bese");
                    imageViewVectorBMI.setImageResource(R.drawable.body_zerobese_img);

                }
                DecimalFormat df = new DecimalFormat("#.##");
                e1 = Double.valueOf(df.format(e1));
                textResultBMI.setText(Double.toString(e1));


            }
            if (age >= 15 && age < 26)
            {
                if (e1 >= 0 && e1 < 17) {

                    //Toast.makeText(getApplicationContext(), "body_severe_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Severe Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_severe_img);

                }
                if (e1 >= 17 && e1 < 21) {

                    //  Toast.makeText(getApplicationContext(), "body_thiness_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_thiness_img);

                }
                if (e1 >= 21 && e1 < 26) {

                    // Toast.makeText(getApplicationContext(), "body_normal_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Normal");
                    imageViewVectorBMI.setImageResource(R.drawable.body_normal_img);

                }

                if (e1 >= 26 && e1 < 31) {

                    // Toast.makeText(getApplicationContext(), "body_over_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Over Weight");
                    imageViewVectorBMI.setImageResource(R.drawable.body_over_img);

                }
                if (e1 >= 31 && e1 <= 100) {

                    // Toast.makeText(getApplicationContext(), "body_zerobese_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: O Bese");
                    imageViewVectorBMI.setImageResource(R.drawable.body_zerobese_img);

                }
                DecimalFormat df = new DecimalFormat("#.##");
                e1 = Double.valueOf(df.format(e1));
                textResultBMI.setText(Double.toString(e1));


            }

            if (age >= 26 && age < 101)
            {
                if (e1 >= 0 && e1 < 17) {

                    //Toast.makeText(getApplicationContext(), "body_severe_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Severe Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_severe_img);

                }
                if (e1 >= 17 && e1 < 21) {

                    //  Toast.makeText(getApplicationContext(), "body_thiness_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Thinness");
                    imageViewVectorBMI.setImageResource(R.drawable.body_thiness_img);

                }
                if (e1 >= 21 && e1 < 26) {

                    // Toast.makeText(getApplicationContext(), "body_normal_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Normal");
                    imageViewVectorBMI.setImageResource(R.drawable.body_normal_img);

                }

                if (e1 >= 26 && e1 < 31) {

                    // Toast.makeText(getApplicationContext(), "body_over_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: Over Weight");
                    imageViewVectorBMI.setImageResource(R.drawable.body_over_img);

                }
                if (e1 >= 31 && e1 <= 100) {

                    // Toast.makeText(getApplicationContext(), "body_zerobese_img", Toast.LENGTH_SHORT).show();
                    textResultBMIMessage.setText("Body Type: O Bese");
                    imageViewVectorBMI.setImageResource(R.drawable.body_zerobese_img);

                }
                DecimalFormat df = new DecimalFormat("#.##");
                e1 = Double.valueOf(df.format(e1));
                textResultBMI.setText(Double.toString(e1));


            }
        }
        buttonTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTips = new Intent(DetailScreen.this,TipsScreen.class);
                startActivity(intentTips);
            }
        });
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.exit_dialog);
                dialog.setTitle("Are You Want To Exit?");





               Button buttonYes = (Button) dialog.findViewById(R.id.buttonYes);
                Button buttonNo = (Button) dialog.findViewById(R.id.buttonNo);
                buttonYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                buttonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });


                dialog.show();
            }
        });



    }
}
