package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentService studentService = new StudentService();
        Student student1 = new ContraktStudent("Иванов Иван", 300000);
        Student student2 =new StateStudent("Петров Петр", 5000);
        Student student3 = new StateStudent("Сидоров Сидор", 3000);
       /* studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.getAllStudents();
        studentService.removeStudent(student1);
        studentService.getAllStudents();*/
        FileGroup fileGroup = new FileGroup();
       /*fileGroup.addStudent(student1);
        fileGroup.addStudent(student2);
        fileGroup.addStudent(student3);*/
       fileGroup.getAllStudents();
        fileGroup.removeStudent(student2);
        fileGroup.getAllStudents();

    }
}