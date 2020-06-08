package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mr, ha, db, zi, ah, sr, jai, sk;
    Button what, who;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mr=findViewById(R.id.btnmr);
        ha=findViewById(R.id.btnha);
        db=findViewById(R.id.btndb);
        zi=findViewById(R.id.btnzi);
        ah=findViewById(R.id.btnah);
        sr=findViewById(R.id.btnsr);
        jai=findViewById(R.id.btnjai);
        sk=findViewById(R.id.btnsk);

        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mr = new Intent(MainActivity.this,mr.class);
                startActivity(mr);
            }
        });

        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ha = new Intent(MainActivity.this,ha.class);
                startActivity(ha);
            }
        });

        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent db = new Intent(MainActivity.this,db.class);
                startActivity(db);
            }
        });

        zi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zi = new Intent(MainActivity.this,zi.class);
                startActivity(zi);
            }
        });

        ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ah = new Intent(MainActivity.this,ah.class);
                startActivity(ah);
            }
        });

        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sr = new Intent(MainActivity.this,sr.class);
                startActivity(sr);
            }
        });

        jai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jai = new Intent(MainActivity.this,ji.class);
                startActivity(jai);
            }
        });

        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sk = new Intent(MainActivity.this,sk.class);
                startActivity(sk);
            }
        });


        what=findViewById(R.id.btnwhat);
        who=findViewById(R.id.btnwho);

        what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wht = new Intent(MainActivity.this,what.class);
                startActivity(wht);
            }
        });

        who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent who = new Intent(MainActivity.this,who.class);
                startActivity(who);
            }
        });

    }
}
