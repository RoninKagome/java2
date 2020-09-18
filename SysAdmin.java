package com.company;

public class SysAdmin {
    File getFile(String filename,Server server) {
        System.out.println("Downloading file " + filename + " from server");
        return server.getFile(filename);
    }
}
