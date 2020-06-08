package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

public class what extends AppCompatActivity {

    TextView what, why;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);

        what=findViewById(R.id.tvwhat);
        why=findViewById(R.id.tvwhy);

        what.setText(Html.fromHtml("<html>আমরা যখন বই দেখি, তখন সবার আগে কী দেখি? বইয়ের সারাংশ, যেটা হয়ত বইয়ের পেছনে থাকে, কিংবা বইয়ের শুরুর দিকে থাকে। সংক্ষেপণ এ তেমনি কিছু বইয়ের সারাংশ একত্রিত করার চেষ্টা করা হয়েছে। এতে করে আপনি বইয়ের দোকানে কিংবা পাঠাগারে না গিয়েও বইটি সম্পর্কে ধারণা পাচ্ছেন।</html>"));

        why.setText(Html.fromHtml("<html>বইপ্রেমীদের অনেকেই একটা বই শেষ হয়ে যাওয়ার পর ভাবতে থাকি এরপর কী পড়ব! তার জন্য আপনাকে বইয়ের দোকানে কিংবা পাঠাগারে গিয়ে খুঁজে দেখতে হয় কোন বইটি পড়বেন। সংক্ষেপণ এ আমি আপনাদের এই কষ্টটুকু কমানোর চেষ্টা করেছি। এখন আপনি যেকোন সময় যেকোন জায়গা থেকে জেনে নিতে পারেন এর পর আপনি কোন বইটি পড়বেন। বইয়ের দোকান কিংবা পাঠাগারে যেতে যেতেই আপনি সংক্ষেপণ এ বইয়ের সারাংশ পড়ে বইগুলো সম্পর্কে একটা ধারণা পেয়ে যেতে পারেন।</html>"));
    }
}
