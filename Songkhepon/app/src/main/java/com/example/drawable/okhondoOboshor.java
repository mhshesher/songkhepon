package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class okhondoOboshor extends AppCompatActivity {

    TextView oo, oos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhondo_oboshor);

        oo=findViewById(R.id.tvOO);
        oo.setText(Html.fromHtml("<html><h1>বইঃ অখন্ড অবসর</h1><br>" +
                "<h2>লেখকঃ কাজী আনোয়ার হোসেন</h2><br>" +
                "<h3>ক্যাটাগরিঃ স্পাই থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ বাংলা</h3></html>"));

        oos=findViewById(R.id.tvOOS);
        oos.setText(Html.fromHtml("<html><h5>রকি পর্বতমালার কোলে ছোট্ট শহর অ্যাসপেন। ওখানে গত চারমাস ধরে একাকী বাস করছে মায়াবী চোখের এক যুবক, জানে না ও কে। কারা যেন ইনজেকশন দিয়ে স্মৃতি নষ্ট করে দিয়েছে ওর। কে দিল ইনজেকশন? কাঁচাপাকা ভ্রুওয়ালা যে-লোকটা ওর স্বপ্নে দেখা দেয়, সে-ই? নাকি ওই হাতকাটা লোকটা, যে ওর দিকে চেয়ে হাসে, চোখ টেপে? তরুণী সাংবাদিক লিমা সোরেন্সনের সঙ্গে পাহাড়ে ক্যাম্পিং করতে গিয়ে একটা লাশ পেল ও। মৃত মানুষটার ক্যামেরা কেস-এ লুকানো কোডটাই যেন কাল হলো ওদের। কোন গোক্ষুরের লেজে পা দিয়েছে, জানে না যুবক। নিষ্ঠুর ভাবে পিটিয়ে আহত করা হল ওকে, খুন হলো ওর বন্ধু পাগলাটে চার্লস রবিনসন, মারাত্বক জখন করা হলো ওর প্রিয় কুকুর হান্টারকে। কেন? কারা করেছে এসব? সহ্যের সীমা অতিক্রম করতেই রুখে দাঁড়াল দুঃসাহসী বাঙালি যুবক।</h5></html>"));
    }
}
