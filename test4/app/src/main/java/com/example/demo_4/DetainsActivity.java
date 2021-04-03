package com.example.demo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detains);
        Intent i = getIntent();
        Contact item = (Contact)i.getSerializableExtra("Contact");
        Toast.makeText(this, item.getName() + item.getPhone_no(), Toast.LENGTH_SHORT).show();
    }
}