package org.example;

public abstract class Student {
    private String FIO;

    public Student(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public String toString() {
        return FIO;
    }
}
