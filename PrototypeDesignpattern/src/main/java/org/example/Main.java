package org.example;

public class Main {
    public static void main(String[] args) {
        Registry registry= new Registry();
        Alstudent alstudent= (Alstudent) registry.getStudent(studentType.ALstudent);
        System.out.println(alstudent);

        OLstudent oLstudent= (OLstudent) registry.getStudent(studentType.OLstudent);
        System.out.println(oLstudent);
    }
}