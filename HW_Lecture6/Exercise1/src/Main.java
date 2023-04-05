import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hinh chu nhat:
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        //Hinh vuong/;
        System.out.println("Enter side: ");
        double side = sc.nextDouble();
        Square square = new Square(side);

        //in thong tin cac gia tri cua hinh va ket qua tinh:
        System.out.println(rectangle + "\n" + square);

    }
}
