package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class angleanddemons extends AppCompatActivity {

    TextView and, ands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angleanddemons);

        and=findViewById(R.id.tvand);
        ands=findViewById(R.id.tvands);

        and.setText(Html.fromHtml("<html><h1>বইঃ এঞ্জেল এন্ড ডেমনস</h1><br>" +
                "<h2>লেখকঃ ড্যান ব্রাউন</h2><br>" +
                "<h3>ক্যাটাগরিঃ থ্রিলার</h3><br>" +
                "<h3>ভাষাঃ ইংরেজি</h3><br>" +
                "<h3>প্রথম প্রকাশঃ ২০০৬</h3></html>"));

        ands.setText(Html.fromHtml("<html><h5>খুন হয়ে যাওয়া এক বিজ্ঞানীর বুকে পোড়া পাঠোদ্ধার করতে রবার্ট ল্যাংডন পৃথিবীর সবচেয়ে বড় বৈজ্ঞানিক প্রতিষ্ঠানে এসে পড়ে। থলের বিড়াল বেরিয়ে পড়লে সবাই অবাক হয়ে পড়ে, ক্যাথলিক চার্চের বিরুদ্ধে বিষবষ্প তুলছে এক শতাব্দী-পুরানো ব্রাদারহুড-দ্য ইলুমিনেটি। স্বরণকালে সবচেয়ে ভয়াবহ অস্ত্রের হাত থেকে খোদ ভ্যাটিকান সিটিকে রক্ষার জন্য ল্যাংডন ঝাঁপিয়ে পড়ে রোমের উপর; সাথে সুন্দরী, রহস্যময়ী পদার্থবিদ ভিট্টোরিয়া ভেট্টা। তারা দুজনে চষে বেড়ায় অস্পৃশ্য সব এলাকা- পরিত্যক্ত ক্যাথোড্রাল, বদ্ধ কবরখানা, বিশাল বিশাল গির্জা, তারপর পৌঁছে পৃথিবীর সবচেয়ে গোপন ভল্টে... অনেকদিন ধরে ভুলে যাওয়া চার্চ অব ইলুমিনেটি।</h5></html>"));
    }
}
