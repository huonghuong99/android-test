package com.example.demo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lvContact);
        ArrayList<Contact> data = new ArrayList<>();
        data.add(new Contact("Contact 1", "0973731649"));
        data.add(new Contact("Contact 2", "0973731649"));
        data.add(new Contact("Contact 3", "0973731649"));
        data.add(new Contact("Contact 4", "0973731649"));
        data.add(new Contact("Contact 5", "0973731649"));
        data.add(new Contact("Contact 6", "0973731649"));
        data.add(new Contact("Contact 7", "0973731649"));
        data.add(new Contact("Contact 8", "0973731649"));
        data.add(new Contact("Contact 9", "0973731649"));
        data.add(new Contact("Contact 10", "0973731649"));

        myAdapter = new MyAdapter(this, data);
        lvContact.setAdapter(myAdapter);
    }
}