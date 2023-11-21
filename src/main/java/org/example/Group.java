package org.example;

import java.io.IOException;
import java.util.List;
// Пример интерфейса для работы с группой студентов
public interface Group {
    void addStudent(Student student);
    void removeStudent(Student student) throws IOException;
    List<String> getAllStudents() throws IOException;
}
