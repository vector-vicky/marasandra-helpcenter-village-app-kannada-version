package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EastPointInfoActivity extends AppCompatActivity {

    TextView eastpointaddresstag;
    TextView eastpointaddress;
    TextView eastpointwebsitetag;
    TextView eastpointwebsite;
    TextView eastpointemergencytag;
    TextView eastpointemergency;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_point_info);

        eastpointaddresstag=findViewById(R.id.activity_east_point_address_tag);
        eastpointaddress=findViewById(R.id.activity_east_point_address);
        eastpointwebsitetag=findViewById(R.id.activity_east_point_websites_tag);
        eastpointwebsite=findViewById(R.id.activity_east_point_website);
        eastpointemergencytag=findViewById(R.id.activity_east_point_emergency_tag);
        eastpointemergency=findViewById(R.id.activity_east_point_emergency);

        eastpointaddresstag.setText("ವಿಳಾಸ:");
        eastpointaddress.setText(R.string.east_point_location);
        eastpointwebsitetag.setText("ಜಾಲತಾಣ:");
        eastpointwebsite.setText(R.string.east_point_website);
        eastpointemergencytag.setText("ತುರ್ತು ಸೇವೆಗಳು:");
        eastpointemergency.setText(R.string.east_point_emergency_services);

        final Context context =this;
        eastpointwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bint=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.epcms.ac.in"));
                startActivity(bint);
            }
        });


        eastpointaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bint=new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/zsXzw6PR5k7YU5Mq5"));
                startActivity(bint);
            }
        });



    }


}
