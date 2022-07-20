package org.example;

public abstract class Student implements Cloneable
{
    int studentID;
    String Grade;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
@Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
}
}
