package handle;

import entity.Product;

import java.util.Scanner;

public class ProductHandle {

    //ktra giá trị nhập vào
    public int checkValue(String name, int value) {
        Scanner sc = new Scanner(System.in);
        while (value < 0) {
            System.out.print(name + " không hợp lệ. Hãy nhập lại: ");
            value = Integer.parseInt(sc.nextLine());
        }
        return value;
    }

    //tao san pham
    public Product creatProduct(Scanner sc, int i) {
        System.out.println("Mời bạn nhập tên product thứ " + (i + 1) + ":");
        Product product = new Product();
        System.out.print("Nhập tên sản phẩm: ");
        product.setName(sc.nextLine());
        System.out.print("Nhập mô tả sản phẩm: ");
        product.setDescribe(sc.nextLine());
        System.out.print("Nhập số lượng của sản phẩm: ");
        int quantity = Integer.parseInt(sc.nextLine());
        product.setQuantity(checkValue("Số lượng", quantity));
        System.out.print("Nhập giá bán của sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        product.setPrice(checkValue("Giá bán", (int) price));
        System.out.print("Nhập đơn vị tính: ");
        product.setUnitCal(sc.nextLine());
        return product;
    }

    //1.xem ds sản phẩm:
    public void displayAllProduct(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //2.tìm sản phẩm theo tên
    public String findProductByName(Product[] products, Scanner sc) {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = sc.nextLine();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return "Đây là sản phẩm bạn cần tìm: " + product;
            }
        }
        return "Không tồn tại sản phẩm có tên là: " + name;
    }

    //3.tìm sản phẩm theo id
    public String findProductByID(Product[] products, Scanner sc) {
        System.out.print("Nhập id sản phẩm bạn muốn tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                return "Đây là sản phẩm bạn cần tìm: " + product;
            }
        }
        return "Không tồn tại sản phẩm có id là: " + id;
    }

    //4.cập nhật số lượng sản phẩm
    public String updateQuantityById(Product[] products, Scanner sc) {
        System.out.print("Nhập id sản phẩm bạn muốn cập nhật số lượng: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Nhập số lượng bạn muốn cập nhật: ");
                int quantityUpdate = Integer.parseInt(sc.nextLine());
                product.setQuantity(checkValue("Số lượng", quantityUpdate));
                return "Đã cập nhật thành công! Đây là sản phẩm sau khi cập nhật: " + product;
            }
        }
        return "Không tồn tại sản phẩm bạn muốn cập nhật!";
    }

    //5.tìm sản phẩm theo số lượng
    public String findByQuantity(Product[] products) {
        String result = "";
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                result += product.toString() + "\n";
            }
        }
        if (result.equals("")) {
            return "Không tồn tại sản phẩm nào có số lượng < 5.";
        } else {
            return result;
        }
    }

    //6.tìm sản phẩm theo giá
    public int filterByPrice(Scanner sc, Product[] products, int option) {
        System.out.println("1. Tìm sản phẩm có giá dưới 50.000.");
        System.out.println("2. Tìm sản phẩm có giá từ 50.000 đến 100.000.");
        System.out.println("3. Tìm sản phẩm có giá từ 100.000.");
        System.out.print("Nhập lựa chọn tiếp theo của bạn: ");
        option = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (Product product : products) {
            if (option == 1 && product.getPrice() < 50000
                    || option == 2 && product.getPrice() >= 50000 && product.getPrice() < 100000
                    || option == 3 && product.getPrice() >= 100000) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) System.out.println("Không tìm thấy!");
        return option;
    }

    //7.xếp giá sản phẩm.
    public void sortByPrice(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
