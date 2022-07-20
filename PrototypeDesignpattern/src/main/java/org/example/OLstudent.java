package org.example;

public class OLstudent extends Student {
    private String BasketSubjects;

    public String getBasketSubjects() {
        return BasketSubjects;
    }

    public void setBasketSubjects(String basketSubjects) {
        BasketSubjects = basketSubjects;
    }

    @Override
    public String toString() {
        return "OLstudent{" +
                "BasketSubjects='" + BasketSubjects + '\'' +
                '}';
    }
}
