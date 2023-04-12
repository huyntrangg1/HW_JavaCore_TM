package entity;

import java.util.ArrayList;

public class Teams {
private ArrayList<Figure> figures;

    public Teams(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "figures=" + figures +
                '}';
    }
}
