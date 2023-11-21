package org.example;

import java.io.*;
import java.util.List;

// Пример класса для работы с группой студентов из файла
public class FileGroup implements Group{

    @Override
    public void addStudent(Student student) {
        // Запись студента в файл
        try(FileWriter writer = new FileWriter("students.txt", true)) {
           writer.write(String.valueOf(student)+"; "+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removeStudent(Student student) throws IOException {
        // Удаление студента из файла
        try {
            File file = new File("students.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null){
               if (!line.equals(String.valueOf(student)+"; ")){
                   content.append(line).append(System.lineSeparator());

               }
            }
            reader.close();
            FileWriter writer = new FileWriter(file);
            writer.write(content.toString());
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public List<String> getAllStudents() throws IOException {
        // Получение списка всех студентов из файла

        File file = new File("students.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String st;
        while ((st=bufferedReader.readLine())!= null)

            System.out.println(st);

        return null;
    }
}
