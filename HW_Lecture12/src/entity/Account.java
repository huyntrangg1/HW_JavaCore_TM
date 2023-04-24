package entity;

public class Account implements IAccount{
    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    public Account(String name, String accountNumber, String email) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = 0.0;
    }

    @Override
    public void recharge(double amount) {
        if(amount > 0) {
            this.accountBalance += amount;
            System.out.println("Bạn đã nạp " + amount + ". Số dư mới của bạn là:  " + this.accountBalance);
        } else {
            System.out.println("Không hợp lệ. Hãy nhập số tiền lớn hơn 0.");
        }
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
        System.out.println("Email của bạn đã thay đổi thành công thành:" + email);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
