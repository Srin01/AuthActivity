package com.example.authactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        textView = findViewById(R.id.finalText);
        Intent intent = getIntent();
        String user = intent.getStringExtra("userName");
        textView.setText(user);
    }
}