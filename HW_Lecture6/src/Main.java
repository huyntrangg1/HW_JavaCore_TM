import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Hinh chu nhat:
        Rectangle rectangle = new Rectangle(-3, 4);
        //getLength&Width
        double length = rectangle.getLength();
        double width = rectangle.getWidth();
        // calculate:
        double areaOfRec = rectangle.calculateAreaOfRec(length, width);
        double perimeterOfRec = rectangle.calPerimeterOfRec(length, width);

        //Hinh vuong:
        Square square = new Square(5);
        //getSide:
        double side = square.getSide();
        // calculate
        double areaOfSquare = square.calArearOfSquare(side);
        double perimeterOfSquare = square.calPerimeterOfSquare(side);

//        System.out.println("Diện tích hình chữ nhật là: " + areaOfRec + "\nChu vi hình chữ nhật là: " + perimeterOfRec);
        System.out.println(rectangle.printResult());
//        System.out.println("Diện tích hình vuông là: " + areaOfSquare + "\nChu vi hình vuông là: " + perimeterOfSquare);

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
