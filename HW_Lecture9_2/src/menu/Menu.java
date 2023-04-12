package menu;

import java.util.Scanner;

public class Menu {
    public int inputNumber(Scanner sc) {
        System.out.print("Mời bạn nhập số lượng danh sách học sinh: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n <= 0) {
            System.out.print("Số lượng không hợp lễ. Hãy nhập lại: ");
            n = Integer.parseInt(sc.nextLine());
        }
        return n;
    }

}
