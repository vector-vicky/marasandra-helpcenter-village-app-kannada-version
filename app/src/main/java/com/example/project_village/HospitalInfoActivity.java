package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalInfoActivity extends AppCompatActivity {




    Button east_point_hospital;
    Button varthur_government_hospital;
    Button seegehalli_hospital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_info);


        east_point_hospital=findViewById(R.id.activity_hospital_one_button);
        varthur_government_hospital=findViewById(R.id.activity_hospital_second_button);
        seegehalli_hospital=findViewById(R.id.activity_hospital_third_button);

        east_point_hospital.setText("ಈಸ್ಟ್ ಪಾಯಿಂಟ್ ಆಸ್ಪತ್ರೆ");
        varthur_government_hospital.setText("ವರ್ತೂರ್ ಸರ್ಕಾರಿ ಆಸ್ಪತ್ರೆ");
        seegehalli_hospital.setText("ಸೀಗೆಹಳ್ಳಿ ಆಸ್ಪತ್ರೆ");


        east_point_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,EastPointInfoActivity.class);
                startActivity(intent);
            }
        });

        varthur_government_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,VarthurGovernmentHospital.class);
                startActivity(intent);

            }
        });

        seegehalli_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,SeegehalliGovernmentHospital.class);
                startActivity(intent);

            }
        });

    }
    private void initTypeface(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"kannada_font.ttf");
        east_point_hospital.setTypeface(typeface);
        varthur_government_hospital.setTypeface(typeface);
        seegehalli_hospital.setTypeface(typeface);
    }
}
