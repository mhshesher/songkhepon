package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class inferno extends AppCompatActivity {

    TextView inf, infs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inferno);

        inf=findViewById(R.id.tvinf);
        infs=findViewById(R.id.tvinfs);

        inf.setText(Html.fromHtml("<html><h1>বইঃ ইনফার্নো</h1><br>" +
                "<h2>লেখকঃ ড্যান ব্রাউন</h2><br>" +
                "<h3>ক্যাটাগরিঃ থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ ইংরেজি</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ২০১৩</h3></html>"));
        infs.setText(Html.fromHtml("<html><h5>সিম্বোলজিস্ট রবার্ট ল্যাংডন জ্ঞান ফিরে নিজেকে আবিষ্কার করে ফ্লোরেন্স শহরে। তার কী হয়েছে, কি ঘটেছে কিংবা কীভাবে এখানে এলো সে সম্পর্কে তার কোনো ধারণাই নেই। স্মৃতিভ্রষ্ট ল্যাংডনের মাথায় প্রতিধ্বনি হতে থাকে একটি কথাঃ 'খুঁজলেই পাবে।'\n" +
                "কিন্তু কি খুঁজতে হবে জানে না ল্যাংডন। তার জামার পকেটে পাওয়া যায় অদ্ভুত আর ভীতিকর একটি জিনিস। এটি কোথেকে এলো তাও সে জানে না। ঘটনাচক্রে তার সঙ্গে জড়িয়ে পড়ে সিয়েনা ব্রুকস নামে অদ্ভুত এক মেয়ে। ল্যাংডন জানে না তার অপরাধ কী, শুধু জানে তাকে হত্যা করার জন্য উন্মাদ হয়ে উঠেছে এক গুপ্তঘাতকসহ একটি বিশেষ সংগঠনের সেনাবাহিনী। জীবন বাঁচাতে সিয়েনাকে নিয়ে সে পালিয়ে বেড়ায়। সেইসঙ্গে রহস্যের সমাধান করতে থাকে একটু একটু করে। আসল সত্যটা যখন উদ্ঘাটির হয়, জানা যায় শুধু ওদের দুজনের জীবনই নয়, পুরো মানবজাতিই মারাত্বক এক হুমকির মুখোমুখি। আর এসবের জন্য দায়ী এক উন্মাদ জেনেটিক ইঞ্জিনিয়ার।</h5></html>"));
    }
}
