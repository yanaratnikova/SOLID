package org.example;

import java.util.ArrayList;
import java.util.List;
// Пример класса для работы со студентами
public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        //Добавление студента в группу
        students.add(student);
    }
    public void removeStudent(Student student){
        // Удаление студента из группы
        students.remove(student);
    }
    public List<Student> getAllStudents(){
        //Получение списка всех студентов

        System.out.println(students);


        return students;
    }
}
