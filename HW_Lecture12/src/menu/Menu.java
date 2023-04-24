package menu;

import entity.Account;

import java.util.Scanner;

public class Menu {
    public void selectOption(Scanner sc, Account account) {
        while (true) {
            System.out.println("\nChọn tác vụ:");
            System.out.println("1. Nạp tiền");
            System.out.println("2. Thay đổi email");
            System.out.println("3. Hiển thị thông tin tài khoản");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền muốn nạp:");
                    double amount = Double.parseDouble(sc.nextLine());
                    account.recharge(amount);
                    break;
                case 2:
                    System.out.println("Nhập email mới:");
                    String newEmail = sc.nextLine();
                    account.changeEmail(newEmail);
                    break;
                case 3:
                    account.displayInfo();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }
    }
}