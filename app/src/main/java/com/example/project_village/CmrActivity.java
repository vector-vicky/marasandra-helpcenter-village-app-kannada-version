package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CmrActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmr);
        Button cmrit=findViewById(R.id.activity_cmr_cmrit);
        Button cmru=findViewById(R.id.activity_cmr_cmr_university);
        Button cmrim=findViewById(R.id.activity_cmr_institute_of_mgmnt);
        Button cmrlaw=findViewById(R.id.activity_cmr_legal);
        Button cmrskill=findViewById(R.id.activity_cmr_skills);
        Button cmrbussiness=findViewById(R.id.activity_cmr_bussiness);
        Button ekyaschl=findViewById(R.id.activity_cmr_ekya_plus_2);
        Button ekyabtm=findViewById(R.id.activity_cmr_ekya_btm);
        Button ekyakanakpura=findViewById(R.id.activity_cmr_ekya_kanakpura);
        Button ekyajpnagar=findViewById(R.id.activity_cmr_ekya_jpnagar);
        Button cmrhigh=findViewById(R.id.activity_cmr_high_school);
        Button cmrpu=findViewById(R.id.activity_cmr_pu_colledge);
        Button cmrnps=findViewById(R.id.activity_cmr_national_public_school);
        Button npsint=findViewById(R.id.activity_cmr_nps_international);
        Button contact;
        contact=findViewById(R.id.activity_contact_cmru);

        cmrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ವಿಶ್ವೇಶ್ವರಯ ತಾಂತ್ರಿಕ ವಿಶ್ವವಿದ್ಯಾಲಯಕ್ಕೆ ಸಂಯೋಜಿತವಾಗಿದೆ. \n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ.\n" +
                        "ಎ.ಐ.ಸಿ.ಟಿ.ಇ ಅನುಮೋದನೆ,ನವದೆಹಲಿ.\n" +
                        "ಎನ್ಬಿಎ ಮಾನ್ಯತೆ 'ಎ' ಗ್ರೇಡ್.");
                intent.putExtra("website","http://cmrit.ac.in/");
                startActivity(intent);
            }
        });



        cmru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಖಾಸಗಿ ವಿಶ್ವವಿದ್ಯಾಲಯವು ಕರ್ನಾಟಕ ರಾಜ್ಯದಲ್ಲಿ 2013 ರ ಕಾಯ್ದೆ 45 ರ ಪ್ರಕಾರ ಸ್ಥಾಪಿಸಲಾಗಿದೆ");
                intent.putExtra("website","http://cmr.edu.in/");
                startActivity(intent);
            }
        });

        cmrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಬೆಂಗಳೂರು ವಿಶ್ವವಿದ್ಯಾಲಯಕ್ಕೆ ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ\n" +
                        "ನವದೆಹಲಿಯ ಎ.ಐ.ಸಿ.ಟಿ.ಇ ಅನುಮೋದಿಸಿದೆ,\n" +
                        "ಮರುಮಾನ್ಯತೆ 'ಎ' ಗ್ರೇಡ್\n" +
                        "ಸ್ಥಿತಿ: 2009 ರಿಂದ ಸ್ವಾಯತ್ತತೆ");
                intent.putExtra("website","http://ims.cmr.ac.in/");
                startActivity(intent);
            }
        });


        cmrlaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಹಿಂದೆ ಸಿಎಮ್ಆರ್ ಕಾನೂನು ಶಾಲೆ");
                intent.putExtra("website","http://ls.cmr.ac.in/");
                startActivity(intent);
            }
        });


        cmrskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಸಿಎಮ್ಆರ್ ಜ್ಞಾನಧರ ಟ್ರಸ್ಟ್ ಪ್ರಚಾರ ಮಾಡಿದೆ");
                intent.putExtra("website","http://www.cmr.ac.in/lifeskills/");
                startActivity(intent);
            }
        });


        cmrbussiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಬೆಂಗಳೂರು ವಿಶ್ವವಿದ್ಯಾಲಯಕ್ಕೆ ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ನವದೆಹಲಿಯ ಎಐಸಿಟಿಇ ಅನುಮೋದಿಸಿದೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ");
                intent.putExtra("website","http://cmrcbs.cmr.ac.in/");
                startActivity(intent);
            }
        });


        ekyaschl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ನವದೆಹಲಿಯ ಕೇಂದ್ರೀಯ ಶಿಕ್ಷಣ ಮಂಡಳಿಗೆ (ಸಿಬಿಎಸ್\u200Cಇ) ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ");
                intent.putExtra("website","http://www.ekyaschools.com/itpl");
                startActivity(intent);
            }
        });


        ekyajpnagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ನವದೆಹಲಿಯ ಭಾರತೀಯ ಪ್ರಮಾಣಪತ್ರದ (ಐ.ಸಿ.ಎಸ್.ಇ) ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ");
                intent.putExtra("website","http://www.ekyaschools.com/jpnagar/");
                startActivity(intent);
            }
        });


        ekyabtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","2016 ರಲ್ಲಿ ಪ್ರಾರಂಭಿಸಲಾಗಿದೆ.");
                intent.putExtra("website","http://www.ekyaschools.com/btm/");
                startActivity(intent);
            }
        });


        ekyakanakpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ವಿಸ್ತೃತ ಪ್ರಿಸ್ಕೂಲ್ ಮತ್ತು ಮಾಂಟೆಸ್ಸರಿ ಕ್ಯಾಂಪಸ್");
                intent.putExtra("website","ಮಾಹಿತಿ ಇಲ್ಲ");
                startActivity(intent);
            }
        });


        cmrhigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಕರ್ನಾಟಕ ಮಾಧ್ಯಮಿಕ ಶಿಕ್ಷಣ ಪರೀಕ್ಷಾ ಮಂಡಳಿಗೆ (ಕೆ.ಎಸ್.ಇ.ಇ.ಬಿ) ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಗುರುತಿಸಲ್ಪಟ್ಟಿದೆ");
                intent.putExtra("website","ಮಾಹಿತಿ ಇಲ್ಲ");
                startActivity(intent);
            }
        });


        cmrpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಕರ್ನಾಟಕ ಪೂರ್ವ ವಿಶ್ವವಿದ್ಯಾಲಯ ಶಿಕ್ಷಣ ಮಂಡಳಿಯಿಂದ ಅನುಮೋದಿಸಲಾಗಿದೆ");
                intent.putExtra("website","http://npuc.cmr.ac.in/");
                startActivity(intent);
            }
        });


        cmrnps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ನವದೆಹಲಿಯ ಕೇಂದ್ರೀಯ ಶಿಕ್ಷಣ ಮಂಡಳಿಗೆ (ಸಿ.ಬಿ.ಎಸ್.ಇ) ಅಂಗಸಂಸ್ಥೆ\n" +
                        "ಕರ್ನಾಟಕ ಸರ್ಕಾರದಿಂದ ಅನುಮೋದಿಸಲಾಗಿದೆ");
                intent.putExtra("website","http://nps.cmr.ac.in/");
                startActivity(intent);
            }
        });


        npsint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","ಸಿಬಿಎಸ್ಇ / ಸಿಬಿಎಸ್ಇ ಇಂಟರ್ನ್ಯಾಷನಲ್\n" +
                        "ಐಜಿಸಿಎಸ್ಇ (ಕೇಂಬ್ರಿಡ್ಜ್ ವಿಶ್ವವಿದ್ಯಾಲಯ, ಯು.ಕೆ)\n" +
                        "ಐಬಿ (ಐಬಿಒ, ಸ್ವಿಟ್ಜರ್ಲೆಂಡ್)");
                intent.putExtra("website","http://www.npsinternational.com.sg/");
                startActivity(intent);
            }
        });


        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8025426977"));
                startActivity(intent);

            }


        });


    }
}
