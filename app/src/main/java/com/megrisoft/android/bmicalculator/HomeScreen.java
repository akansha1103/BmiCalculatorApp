package com.megrisoft.android.bmicalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ANDROID on 11/21/2016.
 */
public class HomeScreen extends Activity {

    private Button btnGetStart;
    private TextView textAboutApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        btnGetStart = (Button)findViewById(R.id.btnGetStart);
        textAboutApp = (TextView)findViewById(R.id.textAboutApp);

        btnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(HomeScreen.this,MainScreen.class);
                startActivity(mainIntent);
            }
        });
        textAboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(HomeScreen.this,AboutScreen.class);
                startActivity(intentAbout);
            }
        });
    }
}
