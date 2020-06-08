package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class db extends AppCompatActivity {

    Button Angle;
    Button Vinci;
    Button Symbol;
    Button Origin;
    Button Inferno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);

        Angle=findViewById(R.id.btnang);
        Angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ang = new Intent(db.this,angleanddemons.class);
                startActivity(ang);
            }
        });

        Vinci=findViewById(R.id.btndavc);
        Vinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent davc = new Intent(db.this,davincicode.class);
                startActivity(davc);
            }
        });

        Symbol=findViewById(R.id.btnsymb);
        Symbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent symb = new Intent(db.this,thelostsymbol.class);
                startActivity(symb);
            }
        });

        Origin=findViewById(R.id.btnorigin);
        Origin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent origi = new Intent(db.this,origin.class);
                startActivity(origi);
            }
        });

        Inferno=findViewById(R.id.btninfr);
        Inferno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infrno = new Intent(db.this,inferno.class);
                startActivity(infrno);
            }
        });
    }
}
