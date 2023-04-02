import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //bai1
        //Hinh chu nhat:
        Rectangle rectangle = new Rectangle(-3, 4);
        // calculate:
        double areaOfRec = rectangle.calArea();
        double perimeterOfRec = rectangle.calPerimeter();

        //Hinh vuong:
        Square square = new Square(5);
        // calculate
        double areaOfSquare = square.calArea();
        double perimeterOfSquare = square.calPerimeter();

        //in ket qua:
        System.out.println(rectangle.printResult());
        System.out.println(square.printResult());

        //in thong tin cac canh:
        System.out.println(rectangle);
        System.out.println(square);


        // bai2: manageHospital
        Doctor doctor = new Doctor(1, "han", -4, "ENT", 60);
        doctor.printAlert();
        Patient patient = new Patient(1, "mai", 67, 1234, LocalDate.of(2020, 10, 2));
        patient.printAlert();
        System.out.println(doctor + "\n" + patient);
    }
}
