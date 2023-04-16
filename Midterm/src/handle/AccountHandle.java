package handle;

import MyException.InvalidEmailException;
import MyException.InvalidPasswordException;
import entity.Account;
import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountHandle {
    private boolean isLoggedIn = true;
    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();

    public void register() {
        Account newAccount = new Account();
        System.out.println("Nhập username:");
        String username = inputUsername(sc);
        System.out.println("Nhập email:");
        String email = inputEmail(sc);
        System.out.println("Nhập password:");
        String password = inputPassword(sc);
        newAccount.setUsername(username);
        newAccount.setEmail(email);
        newAccount.setPassword(password);
        accounts.add(newAccount);
        System.out.println("Đăng ký tài khoản thành công.");
    }

    public void login(Scanner sc, ArrayList<Account> accountsM) {
        Menu menu = new Menu();
        Account loginAccount = new Account();
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        loginAccount.setUsername(username);
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        loginAccount.setPassword(password);
        loginAccount = accountHandle.checkLogin(username, password);
        accountsM = accounts;
        for (Account account : accountsM) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                System.out.println("Xin chào " + loginAccount.getUsername());
                menu.selectOptionLogin(sc, accountsM, loginAccount);
            }
        }
        System.out.println("Đăng nhập thất bại");
        menu.select(sc, accountsM);
    }

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


    public void changePassword(Scanner sc, Account account) {
        AccountHandle accountHandle = new AccountHandle();
        System.out.println("Nhập password mới: ");
        String newPassword = accountHandle.inputPassword(sc);
        account.setPassword(newPassword);
        System.out.println("Thay đổi password thành công");
    }


    public void logout() {
        isLoggedIn = false;
        System.out.println("Đăng xuất thành công!");
    }

    public String inputUsername(Scanner sc) {
        boolean isValis = false;
        String username = new String();
        while (!isValis) {
            username = sc.nextLine();
            if (username.length() >= 5 && username.length() <= 20) {
                isValis = true;
            } else {
                System.out.println("Username cần dài từ 5 đến 20 ký tự");
                System.out.println("vui lòng nhập lại: ");
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
            if (password.length() >= 8 && password.length() <= 20) {
                try {
                    if (!CheckValid.validatePassword(password))
                        throw new InvalidPasswordException("Password yếu.");
                    else
                        isValid = true;
                } catch (InvalidPasswordException e) {
                    System.out.println(e.getMessage() + " Vui lòng nhập lại");
                }
            } else {
                System.out.println("Password cần dài từ 8 đến 20 ký tự");
                System.out.println("Vui lòng nhập lại");
            }
        }
        return password;
    }

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

