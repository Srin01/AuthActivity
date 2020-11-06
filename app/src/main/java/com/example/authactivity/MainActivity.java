package com.example.authactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoogleSignIn(View view)
    {
    }

    public void EmailSignIn(View view)
    {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}