package com.example.demo_4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Contact> data;
    private LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<Contact> data){
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = inflater.inflate(R.layout.item_listview,null);
        }
        //gán biến
        TextView tvName, tvPhone;
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvPhone = (TextView) view.findViewById(R.id.tvPhone);
        Contact item = data.get(i);
        tvName.setText(item.getName());
        tvPhone.setText(item.getPhone_no());

        ConstraintLayout viewItem;
        viewItem = view.findViewById(R.id.view_item);
        viewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, tvName.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context,  DetainsActivity.class);
                i.putExtra("Contact",item);
                context.startActivity(i);
            }
        });



        return view;
    }
}
