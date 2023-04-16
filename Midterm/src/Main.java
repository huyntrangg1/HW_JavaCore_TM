import entity.Account;

import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Menu menu = new Menu();
        menu.selectOption(sc,accounts);
    }
}
