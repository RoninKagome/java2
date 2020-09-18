package com.company;

import java.util.ArrayList;

public class Server {
    ArrayList<File> files = new ArrayList<File>();
    void copyFile(File file) {
        files.add(file);
        System.out.println("copied " + file.name);
    }
    File getFile(String filename) {
        for(int i = 0; i < files.size(); i++)
            if(files.get(i).name==filename)
                return files.get(i);
        System.out.println("cannot find file " + filename + " on server");
        return new File();
    }
}
