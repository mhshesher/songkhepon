package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class thelostsymbol extends AppCompatActivity {

    TextView tls, tlss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thelostsymbol);

        tls=findViewById(R.id.tvtls);
        tlss=findViewById(R.id.tvtlss);

        tls.setText(Html.fromHtml("<html><h1>বইঃ দ্য লস্ট সিম্বল</h1><br>" +
                "<h2>লেখকঃ ড্যান ব্রাউন</h2><br>" +
                "<h3>ক্যাটাগরিঃ থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ ইংরেজি</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ২০০৯</h3><br></html>"));

        tlss.setText(Html.fromHtml("<html><h5>হাজার হাজার বছর আগে বিস্মৃত এক জ্ঞান রক্ষা করে চলেছে সিক্রেট সোসাইটি ফৃম্যাসন। অযোগ্য আর সাধারণ কারোর হাতে সেই জ্ঞান পড়লে পৃথিবীর অপরিমেয় ক্ষতি হয়ে যাবে-- কোড আর সিম্বলের আড়ালে লুকিয়ে থাকা সেই সিক্রেট হস্তগত করার জন্য অশুভ এক শক্তি মরিয়া হয়ে ওঠে-- ফাঁদে ফেলে সিম্বলজিস্ট রবার্ট ল্যাংডনকে নিয়ে আসা হয় ওয়াশিংটন ডিসিতে। তাকে বাধ্য করা হয় সেই সিক্রেটটার রহস্য উদঘাট করতে।\n" +
                "গা শিউড়ে উঠার মতো এক সত্যের মুখোমুখি লুয়াংডন বুঝতে পারে অশুভশক্তির হাতে এই সিক্রেটটা কোনভাবেই তুলে দেয়া যাবে না-- কিন্তু মারাত্বক এক ফাঁদে আটকা পড়া ল্যাংডনের কাছে কোন পথই খোলা নেই। বাধ্য হয়েই তাকে অশুভ শকটির কথামতো কাজ করতে হয়--তারপর?</h5></html>"));
    }
}
