package com.example.project_village;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SeegehalliGovernmentHospital extends AppCompatActivity {

    TextView seegehalliaddresstag;
    TextView seegehalliaddress;
    TextView timings;
    TextView timings_tag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seegehalli_government_hospital);

        seegehalliaddresstag=findViewById(R.id.activity_seegehalli_address_tag);
        seegehalliaddress=findViewById(R.id.activity_seegehalli_address);
        timings = findViewById(R.id.timings);
        timings_tag = findViewById(R.id.timings_tag);

        seegehalliaddresstag.setText(R.string.address);
        timings_tag.setText(R.string.timings_tag);
        seegehalliaddress.setText(R.string.seegehalli_address);
        timings.setText(R.string.timings);

        seegehalliaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bint=new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/yAwQGKdLDwt7Zmbj7"));
                startActivity(bint);
            }
        });
    }

}
