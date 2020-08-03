package com.example.project_village;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.xml.transform.Templates;

public class CallAutoActivity extends AppCompatActivity {

    TextView autoone;
    TextView autotwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_auto);

        autoone=findViewById(R.id.activity_auto_one_call);
        autotwo=findViewById(R.id.activity_auto_two_call);

        autoone.setText(R.string.call_afroz);
        autotwo.setText(R.string.call_baba);

        autoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8095255617"));
                startActivity(intent);

            }


        });
        autotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8105202542"));
                startActivity(intent);

            }


        });
    }
}
