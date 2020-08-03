package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CmrInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmr_info);
        TextView info=findViewById(R.id.activity_cmr_info_details);
        TextView webs=findViewById(R.id.activity_cmr_website_details);

        String information=getIntent().getExtras().getString("information");
        info.setText(information);
        final String website=getIntent().getExtras().getString("website");
        webs.setText(website);


        final Context context =this;
        webs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (website.compareTo("http://cmrit.ac.in/") == 0 || website.compareTo("http://cmr.edu.in/") == 0 || website.compareTo("http://ims.cmr.ac.in/") == 0 ||
                        website.compareTo("http://ls.cmr.ac.in/") == 0 || website.compareTo("http://www.cmr.ac.in/lifeskills/") == 0 || website.compareTo("http://cmrcbs.cmr.ac.in/") == 0 ||
                        website.compareTo("http://www.ekyaschools.com/itpl") == 0 || website.compareTo("http://www.ekyaschools.com/jpnagar/") == 0 || website.compareTo("http://www.ekyaschools.com/btm/") == 0 ||
                        website.compareTo("http://npuc.cmr.ac.in/") == 0 || website.compareTo("http://nps.cmr.ac.in/") == 0 || website.compareTo("http://www.npsinternational.com.sg/") == 0) {
                    Intent bint = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                    startActivity(bint);

                }
            }
        });

    }

}
