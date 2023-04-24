package menu;

import entity.Account;
import handle.AccountHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void selectOption(Scanner sc, ArrayList<Account> accounts) {
        AccountHandle accountHandle = new AccountHandle();
        boolean flag = true;
        while (flag) {
            System.out.println("Bạn có thể thực hiện các công việc sau: ");
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    //login
                    accountHandle.login(sc, accounts);
                    break;
                case 2:
                    //register
                    accountHandle.register();
                    selectOption(sc, accounts);
                    break;
                case 3:
                    //forget password
                    accountHandle.forgetPassword(sc);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void select(Scanner sc, ArrayList<Account> accounts) {
        AccountHandle accountHandle = new AccountHandle();
        boolean flag = true;
        while (flag) {
            System.out.println("Bạn có thể thực hiện các công việc sau: ");
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    //login again
                    accountHandle.login(sc, accounts);
                    break;
                case 2:
                    //forget password
                    accountHandle.forgetPassword(sc);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void selectOptionLogin(Scanner sc, ArrayList<Account> accounts,Account account ) {
        AccountHandle accountHandle = new AccountHandle();
        boolean flag = true;
        while (flag) {
            System.out.println("Bạn có thể thực hiện các công việc sau: ");
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    //change username
                    accountHandle.changeUsername(sc, accounts, account);
                    break;
                case 2:
                    //change email
                    accountHandle.changeEmail(sc, accounts, account);
                    break;
                case 3:
                    //change password
                    accountHandle.changePassword(sc, account);
                    break;
                case 4:
                    accountHandle.logout();
                    selectOption(sc, accounts);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}