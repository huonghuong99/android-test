package com.example.demo_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondsActivity extends AppCompatActivity {

    private TextView tv;
    private Button btnBack;

    private void initUI(){
        tv = findViewById(R.id.tv);
        btnBack = findViewById(R.id.btnBack);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconds);
        initUI();
        Intent i = getIntent();
        String result = i.getStringExtra("Data");
        tv.setText(result);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SecondsActivity.this, com.example.demo_3.MainActivity.class);
                startActivity(back);
            }
        });

        btnBack.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(SecondsActivity.this, "Long Click", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}