package org.example;

public class StateStudent extends Student{
    int scholarship;
    public StateStudent(String FIO, int scholarship) {
        super(FIO);
        this.scholarship = scholarship;
    }
}
