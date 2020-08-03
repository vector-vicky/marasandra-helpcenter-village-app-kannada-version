package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class EducationInfoActivity extends AppCompatActivity {

    TextView schooladdresstag;
    TextView schooladdress;
    TextView schoolwebsitetag;
    TextView schoolwebsite;
    Button Schoolcall;
    String no_web = "ಮಾಹಿತಿ ಇಲ್ಲ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_info);
        schooladdress=findViewById(R.id.activity_education_info_address);
        schooladdresstag=findViewById(R.id.activity_education_info_address_tag);
        schoolwebsite=findViewById(R.id.activity_education_info_website);
        schoolwebsitetag=findViewById(R.id.activity_education_info_websites_tag);
        Schoolcall=findViewById(R.id.activity_education_info_call_button);

        schooladdresstag.setText(R.string.address);
        String preaddressid=getIntent().getExtras().getString("address");
        schooladdress.setText(preaddressid);
        schoolwebsitetag.setText(R.string.website);
        final String prewebsite=getIntent().getExtras().getString("website");
        schoolwebsite.setText(prewebsite);


        Schoolcall.setText(R.string.call);
        Schoolcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone=getIntent().getExtras().getString("phone");
                if(!phone.matches("@0")){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:".concat(phone)));
                startActivity(intent);
            }
            else{
                    Toast toast = Toast.makeText(EducationInfoActivity.this, "call not available",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        final Context context =this;
        schoolwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(prewebsite.compareTo("http://www.tespolytechnic.com/")==0||prewebsite.compareTo("https://www.eastpoint.ac.in")==0|| prewebsite.compareTo("http://puc.gardencitycollege.edu")==0||
               prewebsite.compareTo("http://www.narayanaetechnoschools.com/marathahalli")==0||prewebsite.compareTo("https://www.timekidspreschools.in")==0){
                   Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(prewebsite));
                   startActivity(intent);
               }
            }
        });


    }
}
