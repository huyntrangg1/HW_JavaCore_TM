package view;

import java.util.Scanner;

public class Menu {
    public int inputNumber(Scanner sc) {
        System.out.println("Mời bạn nhập số lượng student muốn tạo: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n <= 0) {
            System.out.println("Số lượng không hợp lễ. Hãy nhập lại: ");
            n = Integer.parseInt(sc.nextLine());
        }
        return n;
    }
}
