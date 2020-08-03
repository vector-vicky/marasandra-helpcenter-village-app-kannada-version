package com.example.project_village;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.EventListener;

import static java.util.logging.Logger.global;

public class MainActivity extends AppCompatActivity {


    TextView hospital;
    TextView transport;
    TextView education;
    Button hospital_button;
    Button transport_button;
    Button education_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hospital_button=findViewById(R.id.activity_main_hospital_button);
        transport_button=findViewById(R.id.activity_main_transport_button);
        education_button=findViewById(R.id.activity_main_education_button);
        hospital=findViewById(R.id.activity_main_hospital_button);
        transport=findViewById(R.id.activity_main_transport_button);
        education=findViewById(R.id.activity_main_education_button);



        hospital.setText("ಆಸ್ಪತ್ರೆಯ ವಿವರಗಳು");
        transport.setText("ಸಾರಿಗೆ ವಿವರಗಳು");
        education.setText("ಶಿಕ್ಷಣ ವಿವರಗಳು");


        hospital_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HospitalActivity.class);

                startActivity(intent);

            }
        });


        transport_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TransportActivity.class);
                startActivity(intent);
            }
        });



        education_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EducationActivity.class);
                startActivity(intent);
            }
        });




    }
    private void initTypeface(Context cOntext){
        Typeface typeface = Typeface.createFromAsset(cOntext.getAssets(),"kannada_font.ttf");
        hospital_button.setTypeface(typeface);
        transport_button.setTypeface(typeface);
        //language.setTypeface(typeface);
        education_button.setTypeface(typeface);

    }


}
