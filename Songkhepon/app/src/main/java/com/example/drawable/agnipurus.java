package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class agnipurus extends AppCompatActivity {

    TextView ap, aps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agnipurus);

        ap=findViewById(R.id.tvap);
        aps=findViewById(R.id.tvaps);

        ap.setText(Html.fromHtml("<html><h1>বইঃ অগ্নিপুরুষ</h1><br>" +
                "<h2>লেখকঃ কাজী আনোয়ার হোসেন</h2><br>" +
                "<h3>ক্যাটাগরিঃ স্পাই থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ বাংলা</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ১৯৮৫</h3></html>"));
        aps.setText(Html.fromHtml("<html><h5>পালিয়ে বেড়াচ্ছে মাসুদ রানা। সিআইএ  এবং জিওনিস্ট ইন্টেলিজেন্সের মৃত্যু পরোয়ানা ঝুলছে ওর মাথার ওপর। কদিন বিশ্রাম নেবে মনে করে আশ্রয় নিল সে বন্ধু রেমারিকের ওখানে, ইটালীতে। তারই সুপারিশে দেহরক্ষীর চাকরি নিল ইটালীর এক ধনী পরিবারে। সেখানে ছোট্ট একটি মেয়ে মিষ্টি একটা গান উপহার দিল রানাকে। দিয়েই চিরবিদায় নিল এ পৃথিবী থেকে। খুন করেছে ওকে কিডন্যাপাররা। কিছুর সাথে নিজেকে জড়াবে না-প্রতিজ্ঞা করেছিল রানা; কিন্তু কখন যে ওকে জয় করে নিয়েছিল কিশোরী মেয়েটা, টেরই পায়নি। এখন আর ঘুমাতে পারে না ও। দাউ দাউ করে জ্বলছে বুকে প্রতিশোধের আগুন।</h5></html>"));
    }
}
