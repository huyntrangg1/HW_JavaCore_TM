package handle;

import entity.Account;

import java.util.Scanner;

public class AccHandle {
    public Account creatAccount(Scanner sc) {
        System.out.println("Nhập tên tài khoản: ");
        String name = sc.nextLine();
        System.out.println("Nhập số tài khoản: ");
        String accountNumber = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        return new Account(name, accountNumber, email);
    }
}
