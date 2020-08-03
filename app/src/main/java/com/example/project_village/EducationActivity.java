package com.example.project_village;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducationActivity extends AppCompatActivity {

    Button cmru;
    Button preschool;
    Button primaryschool;
    Button secondaryschool;
    Button pu;
    Button epc;
    Button poly;
    Button exam;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        cmru=findViewById(R.id.activity_education_cmr_group);
        preschool=findViewById(R.id.activity_education_pre);
        primaryschool=findViewById(R.id.activity_education_primary);
        secondaryschool=findViewById(R.id.activity_education_secondary);
        pu=findViewById(R.id.activity_education_pu);
        epc=findViewById(R.id.activity_education_epc);
        poly=findViewById(R.id.activity_education_poly);
        exam=findViewById(R.id.activity_education_exam);


        cmru.setText(R.string.cmr_group);
        preschool.setText(R.string.pre_school);
        primaryschool.setText(R.string.primary_school);
        secondaryschool.setText(R.string.secondary_school);
        pu.setText("ಪಿ.ಯು.ಸಿ");
        epc.setText("ಈಸ್ಟ್ ಪಾಯಿಂಟ್ ಕಾಲೇಜು");
        poly.setText("ಟಿ.ಇ.ಎಸ್ ಪಾಲಿಟೆಕ್ನಿಕ್ ಕಾಲೇಜು");
        exam.setText("ಪರೀಕ್ಷೆಗಳು");


        cmru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EducationActivity.this,CmrActivity.class);
                startActivity(intent);
            }
        });
        preschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                String address=getString(R.string.time_address);
                intent.putExtra("address",address);
                String website=getString(R.string.time_website);
                intent.putExtra("website",website);
                String phone=getString(R.string.time_phone);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });



        epc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                String address=getString(R.string.epc_address);
                intent.putExtra("address",address);
                String website=getString(R.string.epc_website);
                intent.putExtra("website",website);
                String phone=getString(R.string.epc_phone);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });

        poly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                String address=getString(R.string.poly_address);
                intent.putExtra("address",address);
                String website=getString(R.string.poly_website);
                intent.putExtra("website",website);
                String phone=getString(R.string.poly_phone);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });

        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] schools = {"Narayana PU college" ,"Garden city PU"};

                AlertDialog.Builder builder = new AlertDialog.Builder(EducationActivity.this);
                builder.setTitle("ಪ್ರಕಾರವನ್ನು ಆರಿಸಿ");
                builder.setItems(schools, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.pu1_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.pu1_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.pu1_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }
                        if(which==1){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.pu2_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.pu2_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.pu2_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }


                    }
                });
                builder.show();
            }
        });

        primaryschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] schools = {"ಬ್ರಿಲಿಯಂಟ್ ರಾಷ್ಟ್ರೀಯ ಶಾಲೆ" ,"ಸರ್ಕಾರಿ ಉನ್ನತ ಪ್ರಾಥಮಿಕ ಶಾಲೆ (ಜಿಎಚ್ಪಿಎಸ್)"};

                AlertDialog.Builder builder = new AlertDialog.Builder(EducationActivity.this);
                builder.setTitle("ಪ್ರಕಾರವನ್ನು ಆರಿಸಿ");
                builder.setItems(schools, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.bns_address);
                            intent.putExtra("address",address);
                            String no_website=getString(R.string.no_website);
                            intent.putExtra("website",no_website);
                            String phone=getString(R.string.bns_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }
                        if(which==1){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.ghps_address);
                            intent.putExtra("address",address);
                            String no_website=getString(R.string.no_website);
                            intent.putExtra("website",no_website);
                            String phone=getString(R.string.ghps_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }


                    }
                });
                builder.show();
            }
        });


        secondaryschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] schools = {"ಸರ್ಕಾರಿ ಪ್ರೌಢಶಾಲೆ" ,"ಇಂಗ್ಲಿಷ್ ಹೋಲಿ ಸೇವಿಯರ್ ಪ್ರೌಢಶಾಲೆ"};

                AlertDialog.Builder builder = new AlertDialog.Builder(EducationActivity.this);
                builder.setTitle("ಪ್ರಕಾರವನ್ನು ಆರಿಸಿ");
                builder.setItems(schools, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.ghs_address);
                            intent.putExtra("address",address);
                            String no_website=getString(R.string.no_website);
                            intent.putExtra("website",no_website);
                            String phone=getString(R.string.ghs_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }
                        if(which==1){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.hses_address);
                            intent.putExtra("address",address);
                            String no_website=getString(R.string.no_website);
                            intent.putExtra("website",no_website);
                            String phone=getString(R.string.hses_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }



                    }
                });
                builder.show();

            }
        });

        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this,ExamActivity.class);
                startActivity(intent);
            }
        });


    }
}
