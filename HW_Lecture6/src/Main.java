import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //bai1
        //Hinh chu nhat:
        Rectangle rectangle = new Rectangle(0, 100);

        //Hinh vuong:
        Square square = new Square(0);

        //tinh va in ket qua:
        rectangle.cal();
        square.cal();

        //in thong tin cac gia tri cua hinh:
        System.out.println(rectangle + "\n" + square);

        // bai2: manageHospital
        Doctor doctor = new Doctor(1, "han", 0, "ENT", 0);
        Patient patient = new Patient(1, "mai", 23, "1234", "2020-12-02");
        System.out.println(doctor + "\n" + patient);
    }
}
