package handle;

import entity.Figure;
import entity.Teams;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamsHandle {
    public Teams creatTeam(Scanner sc) {
        FigureHandle figureHandle =new FigureHandle();
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i <5 ; i++){
            System.out.println("Nhập thông tin tướng thứ "  +(i+1) +": ");
            figures.add(figureHandle.creatFigure(sc));
        }
        return new Teams(figures);
    }
}
