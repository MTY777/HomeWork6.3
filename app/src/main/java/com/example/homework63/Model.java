package com.example.homework63;

import android.widget.TextView;

public class Model {
private String name;
private String avtor;
private String number;
private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Model(String name, String avtor, String number, String time) {
        this.name = name;
        this.avtor = avtor;
        this.number = number;
        this.time = time;
    }
}
