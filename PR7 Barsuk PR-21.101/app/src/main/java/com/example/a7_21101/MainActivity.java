package com.example.a7_21101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        button2 = findViewById(R.id.SignUp);
        button2.setOnClickListener(this);

    }
    public void onClick(View view){
        Intent intent = new Intent(this, LinearLayouts.class);
        startActivity(intent);
    }
}
