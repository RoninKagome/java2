package com.company;

public class Student {
    public String name;
    private int knowledge = 0;
    public void hearTip() {
        knowledge++;
        System.out.println(name + " knowledge is " + knowledge);
    }
}
