public class Main {

    public static void main(String[] args) {
        //Hinh chu nhat:
        Rectangle rectangle = new Rectangle(3, 4);

        //Hinh vuong/;/
        Square square = new Square(3);

        //tinh va in ket qua:
        rectangle.cal(); //hcn
        square.cal(); //hv

        //in thong tin cac gia tri cua hinh:
        System.out.println(rectangle + "\n" + square);
    }
}
