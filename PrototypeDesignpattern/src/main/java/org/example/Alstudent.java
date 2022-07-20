package org.example;

public class Alstudent extends Student {
    @Override
    public String toString() {
        return "Alstudent{" +
                "practicalTestScore=" + practicalTestScore +
                '}';
    }

    public int getPracticalTestScore() {
        return practicalTestScore;
    }

    public void setPracticalTestScore(int practicalTestScore) {
        this.practicalTestScore = practicalTestScore;
    }

    private int practicalTestScore;


}
