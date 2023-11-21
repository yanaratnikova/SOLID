package org.example;

import java.util.List;
// Пример класса для работы с группой студентов из базы данных
public class DatabaseGroup implements Group{
    @Override
    public void addStudent(Student student) {
        // Добавление студента
    }

    @Override
    public void removeStudent(Student student) {
        // Удаление студента

    }

    @Override
    public List<String> getAllStudents() {
        // Получение списка всех студентов из базы данных
        return null;
    }
}
