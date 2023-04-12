package entity;

import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Teams> teams;


    public SummonRift(ArrayList<Teams> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift: \n" + teams + "\b";

    }
}
