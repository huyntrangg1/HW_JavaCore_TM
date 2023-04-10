package menu;

import entity.Product;
import handle.ProductHandle;

import java.util.Scanner;

public class Menu {
    public int inputNumber(Scanner sc) {
        System.out.print("Mời bạn nhập số lượng sản phẩm muốn tạo: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n <= 0) {
            System.out.print("Số lượng không hợp lễ. Hãy nhập lại: ");
            n = Integer.parseInt(sc.nextLine());
        }
        return n;
    }

    public void selectOption(Product[] products, Scanner sc) {
        ProductHandle productHandle = new ProductHandle();
        boolean flag =true;
        while(flag) {
            System.out.println("1. Xem danh sách sản phẩm. ");
            System.out.println("2. Tìm sản phẩm theo tên.");
            System.out.println("3. Tìm sản phẩm theo id.");
            System.out.println("4. Cập nhật số lượng sản phẩm.");
            System.out.println("5. Tìm các sản phẩm có số lượng dưới 5.");
            System.out.println("6. Tìm sản phẩm theo mức giá. ");
            System.out.println("7. Sắp xếp sản phẩm theo giá");
            System.out.println("8. Thoát.");
            System.out.println("Hãy chọn 1 trong 8:");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    productHandle.displayAllProduct(products);
                    break;
                case 2:
                    System.out.println(productHandle.findProductByName(products, sc));
                    break;
                case 3:
                    System.out.println(productHandle.findProductByID(products, sc));
                    break;
                case 4:
                    System.out.println(productHandle.updateQuantityById(products, sc));
                    break;
                case 5:
                    System.out.println(productHandle.findByQuantity(products));
                    break;
                case 6:
                    productHandle.filterByPrice(sc, products, option);
                    break;
                case 7:
                    productHandle.sortByPrice(products);
                    break;
                case 8:
                    System.out.println("Thoát khỏi chương trình...");
                    flag = false;
                    break;
            }
        }
    }
}