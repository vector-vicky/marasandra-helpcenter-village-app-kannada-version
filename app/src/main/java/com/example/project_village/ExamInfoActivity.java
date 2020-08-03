package com.example.project_village;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExamInfoActivity extends AppCompatActivity {

    TextView examname;
    TextView examlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_info);

        examname = findViewById(R.id.activity_exam_tag);
        examlink = findViewById(R.id.activity_exam_link);


        String information=getIntent().getExtras().getString("information");
        examname.setText(information);
        final String website=getIntent().getExtras().getString("website");
        examlink.setText(website);

        final Context context =this;
        examlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bint=new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                startActivity(bint);
            }
        });
    }
}
