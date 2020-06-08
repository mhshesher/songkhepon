package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class who extends AppCompatActivity {

    TextView who1, who2, who3, who4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);

        who1=findViewById(R.id.tvk1);
        who1.setText(Html.fromHtml("<html><h1>মোঃ মেহেদি হাসান</h1><html>"));
        who2=findViewById(R.id.tvk2);
        who2.setText(Html.fromHtml("<html><h3>সেকশন সি, ৪৭তম  ব্যাচ</h3><html>"));
        who3=findViewById(R.id.tvk3);
        who3.setText(Html.fromHtml("<html><h3>কম্পিউটার সায়েন্স এন্ড ইঞ্জিনিয়ারিং</h3><html>"));
        who4=findViewById(R.id.tvk4);
        who4.setText(Html.fromHtml("<html><h3>ড্যাফোডিল ইন্টারন্যাশনাল ইউনিভার্সিটি</h3><html>"));


    }
}
