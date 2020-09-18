package com.company;

import java.util.ArrayList;

public class Computer {
    public int ip;
    public ArrayList<File> files = new ArrayList<File>();
    public void createFile(String filename) {
        File file = new File();
        file.name = filename;
        System.out.println("created " + file.name);
        files.add(file);
        System.out.println("added " + file.name);
    }
}
