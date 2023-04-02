public class Main {
    public static void main(String[] args) {
        //bai1
        //Hinh chu nhat:
        Rectangle rectangle = new Rectangle(3, 4);

        //Hinh vuong/;/
        Square square = new Square(3);

        //tinh va in ket qua:
        rectangle.cal(); //hcn
        square.cal(); //hv

        //in thong tin cac gia tri cua hinh:
        System.out.println(rectangle + "\n" + square);

        // bai2: manageHospital
        Doctor doctor = new Doctor(1, "Han", 28, "ENT", 51);
        Patient patient = new Patient(1, "Mai", 23, "1234", "2020-12-02");
        System.out.println(doctor + "\n" + patient);
    }
}
