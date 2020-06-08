package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

public class dhongsPahar extends AppCompatActivity {

    TextView dp, dps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhongs_pahar);

        dp=findViewById(R.id.tvdp);
        dps=findViewById(R.id.tvdps);

        dp.setText(Html.fromHtml("<html><h1>বইঃ ধ্বংস পাহাড়</h1><br>" +
                "<h2>লেখকঃ কাজী আনোয়ার হোসেন</h2><br>" +
                "<h3>ক্যাটাগরিঃ স্পাই থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ বাংলা</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ১৯৬৬</h3></html>"));
        dps.setText(Html.fromHtml("<html><h5>এক প্রতিভাবান বিজ্ঞানী কবির চৌধুরী কাপ্তাই শহরের কাছে একটা পাহাড়ের ভেতর আলট্রা সোনিকস (অতিশব্দ) এবং অ্যান্টি-গ্র্যাভিটি নিয়ে গোপন গবেষণা করছিলো। কাপ্তাই বাঁধ তৈরির ফলে বিশাল লেকের নিচে তলিয়ে যাচ্ছে পাহাড়টা। তাই সে সিদ্ধান্ত নিলো পাকিস্তানের কোনো শত্রু দেশের (ভারত) সরবরাহ করা শক্তিশালী ডিনামাইট ফাটিয়ে উড়িয়ে দেবে বাঁধটা। আর সেটা ঠেকানোর দায়িত্ব পড়ে তৎকালীন পূর্ব পাকিস্তানের কাউন্টার ইন্টেলিজেন্স এজেন্ট মাসুদ রানার উপর।</h5></html>"));
    }
}
