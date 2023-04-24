import entity.Account;
import handle.AccHandle;
import menu.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccHandle accHandle =  new AccHandle();
        Account account =  accHandle.creatAccount(sc);
        Menu menu = new Menu();
        menu.selectOption(sc, account);
    }
}
