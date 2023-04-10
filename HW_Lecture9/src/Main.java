import entity.Product;
import handle.ProductHandle;
import menu.Menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Product[] products = new Product[menu.inputNumber(sc)];
        ProductHandle productHandle = new ProductHandle();
        for (int i = 0; i < products.length; i++) {
            Product product = productHandle.creatProduct(sc, i);
            products[i] = product;
        }
        menu.selectOption(products,sc);
    }
}
