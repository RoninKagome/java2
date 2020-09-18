package com.company;

public class Teacher {
    public String name;
    private int reputation = 0;
    public void sayTip() {
        reputation++;
        System.out.println(name + " reputation is " + reputation);
    }
}
