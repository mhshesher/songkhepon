package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class davincicode extends AppCompatActivity {

    TextView dvc, dvcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davincicode);

        dvc=findViewById(R.id.tvdvc);
        dvcs=findViewById(R.id.tvdvcs);

        dvc.setText(Html.fromHtml("<html><h1>বইঃ দা ভিঞ্চি কোড</h1><br>" +
                "<h2>লেখকঃ ড্যান ব্রাউন</h2><br>" +
                "<h3>ক্যাটাগরিঃ থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ ইংরেজি</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ২০০৩</h3></html>"));
        dvcs.setText(Html.fromHtml("<html><h5>দু'হাজার বছরের পুরানো একটি সত্যকে চিরতরে নির্মূল করার জন্য প্যারিসে একই দিনে হত্যা করা হয় চারজন প্রখ্যাত ব্যাকটিকে। কি সেই সত্য যে সত্য উন্মোচিত হলে একটি প্রতিষ্ঠিত ধর্মমতের ভিত্তি কেঁপে যাবে, হাজার বছরের ইতিহার লিখতে হবে একেবারে নতুন করে-আর কেনই বা হাজার বছর ধরে একটি সিক্রেট সোসাইটি সেই সত্যকে সঙ্গোপনে লালন করে আসছে যে সোসাইটির সদস্য ছিলেন আইজ্যাক নিউটন, ভিক্টর হুগো, বত্তিচেল্লি আর লিওনার্দো দা ভিঞ্চির মতো জগদ্বিখ্যাত ব্যাক্তিবর্গ।\n" +
                "উগ্র ক্যাথলিক সংগঠন ওপাস দাই সেই সত্যকে পুরোপুরি নির্মূল করার আগে অভিনবভাবে গুপ্তসংঘ সত্যটা হস্তান্তর করে দেয় বাইরের একজনের কাছে আর ঘটনাচক্রে হার্ভার্ডের এক সিম্বোলজিস্ট জড়িয়ে পড়ে মারাত্বক এক মিশনে। শেষ পর্যন্ত, সেই সত্যটা কী-আর পৃথিবীবাসী কি সেই সত্যটা জানতে পেরেছিল তারই উত্তর নিহিত আছে দা ভিঞ্চি কোড-এ</h5></html>"));
    }
}
