package com.example.demo_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt;
    private Button btn;

    private void initUI(){
        edt = findViewById(R.id.edt);
        btn = findViewById(R.id.btn);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        //bắt sự kiện khi nhấn button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edt.getText().toString();
                if(s.isEmpty()){
                    Toast.makeText(MainActivity.this, "hãy nhập thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                    //gửi dữ lieu qua seconds Activity
                    Intent i = new Intent(MainActivity.this, SecondsActivity.class);
                    i.putExtra("Data", s);
                    startActivity(i);
                }
            }
        });
    }
}