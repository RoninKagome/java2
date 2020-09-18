package com.company;

public class Main {

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        Teacher teacher = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();

        classRoom.teachers.add(teacher);
        classRoom.students.add(student1);
        classRoom.students.add(student2);

        classRoom.teachers.get(0).name = "Vasya";
        classRoom.students.get(0).name = "Veronika";
        classRoom.students.get(1).name = "Stas";

        classRoom.communication(classRoom.teachers.get(0),classRoom.students.get(0));

        Computer computer = new Computer();
        computer.ip = 1;
        classRoom.computers.add(computer);

        classRoom.fileCreation(classRoom.students.get(1),classRoom.computers.get(0),"file.txt");

        Server server = new Server();
        classRoom.fileCopy(classRoom.computers.get(0),classRoom.computers.get(0).files.get(0),server);

        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.getFile("file.txt",server);
    }
}
