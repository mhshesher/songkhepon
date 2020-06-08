package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ekattorerdinguli extends AppCompatActivity {

    TextView ed, eds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekattorerdinguli);

        ed=findViewById(R.id.tved);
        eds=findViewById(R.id.tveds);

        ed.setText(Html.fromHtml("<html><h1>বইঃ একাত্তরের দিনগুলি</h1>" +
                "<h2>লেখকঃ জাহানারা ইমাম</h2>" +
                "<h3>ক্যাটাগরিঃ মুক্তিযুদ্ধের উপন্যাস</h3>" +
                "<h3>ভাষাঃ বাংলা</h3>" +
                "<h3>প্রথম প্রকাশঃ ১৯৮৬</h3></html>"));

        eds.setText(Html.fromHtml("<html><h5>তবে তাই হোক। হৃদয়কে পাথর করে, বুকের গহীনে বহন করা বেদনাকে সংহত করে দুঃখের নিবিড় অতলে ডুব দিয়ে তুলে আনি বিন্দু বিন্দু মুক্তোদানার মতো অভিজ্ঞতার সকল নির্যাস। আবার আমরা ফিরে তাকাই আমারদের চরম শোক ও পরম গৌরবে মণ্ডিত মুক্তিযোদ্ধের সেই দিনগুলোর দিকে এক মুক্তিযোদ্ধার মাতা, এক সংগ্রামী দেশপ্রেমিকের স্ত্রী, এ দৃঢ়চেতা বাঙালী নারী আমাদের সকলের হয়ে সম্পাদন করেছেন এই কাজ। বুকচেরা আর্তনাদ নয়, শোকবিহ্বল ফরিয়াদ নয়, তিনি গোলাপকুঁড়ির মতো মেলে ধরেছেন আপনকার নিভৃততম দুঃখ অনুভূতি। তাঁর ব্যক্তিগত শোকস্মৃতি তাই মিলেমিশে একাকার হয়ে যায় আমাদের সকলের টুকরো টুকরো অগণিত দুঃখবোধের অভিজ্ঞতার সঙ্গে, তাঁর আপনজনের গৌরবগাথা যুক্ত হয়ে যায় জাতির হাজারো বীরগাথার সঙ্গে। রুমী বুঝি কোন অলক্ষ্যে হয়ে যায় আমাদের সকলের আদরের ভাইটি, সজ্জন ব্যক্তিত্ত্ব শরীফ প্রতীক হয়ে পড়েন রাশভারী স্নেহপ্রবণ পিতৃরূপের। কিছুই আমরা ভুলবো না, কাউকে ভুলবো না, এই অঙ্গীকারের বাহক জাহানারা ইমামের গ্রন্থ নিছক দিনলিপি নয়, জাতির হৃদয়ছবি ফুটে উঠেছে এখানে।</h5></html>"));
    }
}
