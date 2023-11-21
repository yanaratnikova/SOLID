package org.example;

public class ContraktStudent extends Student{
    int payment;
    public ContraktStudent(String FIO, int payment) {
        super(FIO);
        this.payment = payment;
    }
}
