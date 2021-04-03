package com.example.demo_4;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String phone_no;

    public Contact(String name, String phone_no){
        this.name = name;
        this.phone_no = phone_no;
    }

    public Contact(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
