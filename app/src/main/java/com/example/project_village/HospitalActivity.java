package com.example.project_village;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalActivity extends AppCompatActivity {



    Button call_ambulance_button;

    Button hospital_info_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        call_ambulance_button=findViewById(R.id.activity_hospital_call_ambulance_button);

        hospital_info_button=findViewById(R.id.activity_hospital_location_button);


        call_ambulance_button.setText("ಆಂಬ್ಯುಲೆನ್ಸ್ಗೆ ಕರೆ ಮಾಡಿ");

        hospital_info_button.setText("ಸ್ಥಳ / ಮಾಹಿತಿ");

        call_ambulance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] colors = {"ಸರ್ಕಾರಿ ಆಸ್ಪತ್ರೆ" ,"ಖಾಸಗಿ ಆಸ್ಪತ್ರೆ-1 (ಈಸ್ಟ್ ಪಾಯಿಂಟ್ ಆಸ್ಪತ್ರೆ)","ಖಾಸಗಿ ಆಸ್ಪತ್ರೆ-2 (ಸೀಗೆಹಳ್ಳಿ ಆಸ್ಪತ್ರೆ)"};

                AlertDialog.Builder builder = new AlertDialog.Builder(HospitalActivity.this);
                builder.setTitle("ಆಸ್ಪತ್ರೆ ಆಯ್ಕೆಮಾಡಿ");
                builder.setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:108"));
                            startActivity(intent);
                        }
                        else if(which==1){
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:080-25136200"));
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:78290 52999"));
                            startActivity(intent);
                        }

                    }
                });
                builder.show();

            }
        });

        hospital_info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(HospitalActivity.this,HospitalInfoActivity.class);
                startActivity(intent1);
            }
        });



    }

    private void initTypeface(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"kannada_font.ttf");
        call_ambulance_button.setTypeface(typeface);
        hospital_info_button.setTypeface(typeface);
    }
}
