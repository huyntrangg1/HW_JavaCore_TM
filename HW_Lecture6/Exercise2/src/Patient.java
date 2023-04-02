import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends ManageHospital{
    private String medicalNumber;
    private String date;

    public Patient(int id, String name, int age, String medicalNumber, String date) {
        super(id, name,age);
        this.medicalNumber = medicalNumber;
        this.date = date;
    }
    //chuyen String thanh dang Date:
    public LocalDate getDate() {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toString() {
        return "- Patient{" + super.toString() +
                ", medicalNumber=" + medicalNumber +
                ", date=" + getDate() +
                '}';
    }
}