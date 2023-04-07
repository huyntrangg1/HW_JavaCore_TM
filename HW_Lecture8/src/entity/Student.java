package entity;

import handle.StudentHandle;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private double scoreMath;
    private double scoreChemistry;
    private double scorePhysic;

    public Student() {
       this.id = ++autoId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    @Override
    public String toString() {
        return "- Id = " + id +
                "\n- Name: " + name;
    }
}
