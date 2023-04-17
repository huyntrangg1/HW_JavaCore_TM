package handle;

import myexception.InvalidEmailException;
import myexception.InvalidPasswordException;
import entity.Account;
import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountHandle {
    private boolean isLoggedIn = true;
    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();

    //dang ky:
    public void register() {
        System.out.println("Nhập username:");
        String username = inputUsername(sc);
        System.out.println("Nhập email:");
        String email = inputEmail(sc);
        System.out.println("Nhập password:");
        String password = inputPassword(sc);
        accounts.add(new Account(username, email, password));
        System.out.println("Đăng ký tài khoản thành công.");
    }

    //dang nhap:
    public void login(Scanner sc, ArrayList<Account> accountsL) {
        Menu menu = new Menu();
        Account loginAccount = new Account();
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        loginAccount.setUsername(username);
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        loginAccount.setPassword(password);
        loginAccount = accountHandle.checkLogin(username, password);
        accountsL = accounts;
        for (Account account : accountsL) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                System.out.println("Xin chào " + loginAccount.getUsername());
                menu.selectOptionLogin(sc, accountsL, loginAccount);
            }
        }
        System.out.println("Đăng nhập thất bại");
        menu.select(sc, accountsL);
    }

    //dang xuat:
    public void logout() {
        isLoggedIn = false;
        System.out.println("Đăng xuất thành công!");
    }

    //thay doi username
    public void changeUsername(Scanner sc, ArrayList<Account> accounts, Account account) {
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập username mới: ");
        String newUsername = accountHandle.inputUsername(sc);
        while (true) {
            boolean usernameExists = false;
            for (Account acc : accounts) {
                if (acc.getUsername().equals(newUsername)) {
                    usernameExists = true;
                    break;
                }
            }
            if (usernameExists || account.getUsername().equals(newUsername)) {
                System.out.println("Username đã tồn tại! Nhập username khác: ");
                newUsername = accountHandle.inputUsername(sc);
            } else {
                account.setUsername(newUsername);
                System.out.println("Thay đổi username thành công");
                break;
            }
        }
    }

    //thay doi email
    public void changeEmail(Scanner sc, ArrayList<Account> accounts, Account account) {
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập email mới: ");
        String newEmail = accountHandle.inputEmail(sc);
        while (true) {
            boolean emailExists = false;
            for (Account acc : accounts) {
                if (acc.getEmail().equals(newEmail)) {
                    emailExists = true;
                    break;
                }
            }
            if (emailExists || account.getEmail().equals(newEmail)) {
                System.out.println("Email đã tồn tại! Nhập email khác: ");
                newEmail = accountHandle.inputEmail(sc);
            } else {
                account.setEmail(newEmail);
                System.out.println("Thay đổi email thành công");
                break;
            }
        }
    }

    //thay doi password
    public void changePassword(Scanner sc, Account account) {
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập password mới: ");
        String newPassword = accountHandle.inputPassword(sc);
        while (account.getPassword().equals(newPassword)) {
            System.out.println("Trùng với mật khẩu cũ! Hãy nhập một mật khẩu mới: ");
            newPassword = accountHandle.inputPassword(sc);
        }
        account.setPassword(newPassword);
        System.out.println("Thay đổi password thành công");
    }

    //nhap dau vao:
    public String inputUsername(Scanner sc) {
        boolean isValis = false;
        String username = new String();
        while (!isValis) {
            username = sc.nextLine();
            if (username.length() >= 5 && username.length() <= 20) {
                isValis = true;
            } else {
                System.out.println("Username cần dài từ 5 đến 20 ký tự");
                System.out.println("Vui lòng nhập lại: ");
            }
        }
        return username;
    }

    public String inputEmail(Scanner sc) {
        AccountHandle accountHandle = new AccountHandle();
        String email = new String();
        boolean isValid = false;
        while (!isValid) {
            email = sc.nextLine();
            if (!accountHandle.checkEmailContains(email)) {
                try {
                    if (!CheckValid.validateEmail(email))
                        throw new InvalidEmailException("Email không hợp lệ.");
                    else
                        isValid = true;
                } catch (InvalidEmailException e) {
                    System.out.println(e.getMessage() + " Vui lòng nhập lại");
                }
            } else {
                System.out.println("Email đã được đăng ký tài khoản, vui lòng sử dụng email khác");
            }
        }
        return email;
    }

    public String inputPassword(Scanner sc) {
        String password = new String();
        boolean isValid = false;
        while (!isValid) {
            password = sc.nextLine();
            if (password.length() >= 7 && password.length() <= 15) {
                try {
                    if (!CheckValid.validatePassword(password))
                        throw new InvalidPasswordException("Password yếu.");
                    else
                        isValid = true;
                } catch (InvalidPasswordException e) {
                    System.out.println(e.getMessage() + " Vui lòng nhập lại");
                }
            } else {
                System.out.println("Password cần dài từ 7 đến 15 ký tự");
                System.out.println("Vui lòng nhập lại");
            }
        }
        return password;
    }

    //quen mkhau
    public void forgetPassword(Scanner sc) {
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        if (accountHandle.checkEmailContains(email)) {
            System.out.println("Nhập mật khẩu mới: ");
            String password = inputPassword(sc);
            accountHandle.updatePassword(email, password);
        } else {
            System.out.println("Email chưa được đăng ký");
        }
    }

    //ktra tai khoan dang nhap
    public Account checkLogin(String username, String password) {
        AccountHandle accountHandle = new AccountHandle();
        for (Account account : accounts) {
            if (account.getUsername().equals(username))
                if (account.getPassword().equals(password)) {
                    return account;
                } else {
                    System.out.println("Kiểm tra lại username hoặc password");
                }
        }
        return null;
    }

    //cap nhat mk cho chuc nang quen mk
    public void updatePassword(String email, String newPassword) {
        AccountHandle accountHandle = new AccountHandle();
        for (Account account : accounts) {
            if (account.getEmail().equals(email)) {
                account.setPassword(newPassword);
            }
        }
    }

    public boolean checkEmailContains(String email) {
        AccountHandle accountHandle = new AccountHandle();
        for (Account account : accounts) {
            if (account.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}

