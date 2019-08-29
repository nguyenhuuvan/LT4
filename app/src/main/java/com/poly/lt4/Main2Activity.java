package com.poly.lt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    boolean c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this, "văn", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "ừ", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "abcde", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "abc", Toast.LENGTH_SHORT).show();
    }
}
