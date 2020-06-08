package com.example.drawable;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mr extends AppCompatActivity {

    Button Okhondo;
    Button Agnipurus;
    Button Dhongso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr);

        Okhondo=findViewById(R.id.btnOkhondoOboshor);
        Okhondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oo = new Intent(mr.this,okhondoOboshor.class);
                startActivity(oo);
            }
        });

        Agnipurus=findViewById(R.id.btnAgnipurus);
        Agnipurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ap = new Intent(mr.this,agnipurus.class);
                startActivity(ap);
            }
        });

        Dhongso=findViewById(R.id.btnDhongso);
        Dhongso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(mr.this,dhongsPahar.class);
                startActivity(dp);
            }
        });
    }
}
