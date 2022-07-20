package org.example;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<studentType,Student> students = new HashMap<>();

    public Registry(){

      this.initialize();

    }
    public Student getStudent(studentType studentType){
        Student student = null;
        try{
             student =(Student) students.get(studentType).clone();

        }catch(CloneNotSupportedException e){

            e.printStackTrace();
        }
        return student;


    }

    private void initialize() {
        Alstudent alstudent =new Alstudent();
        alstudent.setGrade("A");
        alstudent.setPracticalTestScore(67);
        alstudent.setStudentID(2640);

        OLstudent oLstudent = new OLstudent();
        oLstudent.setBasketSubjects("TI");
        oLstudent.setGrade("C");
        oLstudent.setStudentID(2345);
        students.put(studentType.ALstudent,alstudent);
        students.put(studentType.OLstudent,oLstudent);
    }
}
