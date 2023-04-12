package handle;
import entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure creatFigure(Scanner sc){

        System.out.println("Nhập tên tướng: ");
        String name= sc.nextLine();
        System.out.println("Nhập vị trí của tướng: ");

        String position = sc.nextLine();
        return new Figure(name, position);
    }
}
