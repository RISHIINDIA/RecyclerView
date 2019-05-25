package com.example.android.instimobops;

public class Numbers {

    private int number;

    public Numbers(int num)
    {
        number = num;
    }

    public String getNumber() {
        return Integer.toString(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
