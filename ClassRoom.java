package com.company;

import java.util.ArrayList;

public class ClassRoom {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    ArrayList<Computer> computers = new ArrayList<Computer>();
    Server server = new Server();
    void communication(Teacher teacher, Student student) {
        System.out.println("Teacher " + teacher.name + " talked to " + student.name);
        teacher.sayTip();
        student.hearTip();
    }
    void fileCreation(Student student, Computer computer, String filename) {
        computer.createFile(filename);
        System.out.println("Student " + student.name + " created file " + filename + " on computer " + computer.ip);
    }
    void fileCopy(Computer computer, File file,Server server) {
        server.copyFile(file);
        System.out.println("Server copied file " + file.name + " from computer " + computer.ip);
    }
}
