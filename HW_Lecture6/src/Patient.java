import java.time.LocalDate;

public class Patient extends ManageHospital{
    private int medicalNumber;
    private LocalDate date;

    public Patient(int id, String name, int age, int medicalNumber, LocalDate date) {
        super(id, name, age);
        this.medicalNumber = medicalNumber;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                ", medicalNumber=" + medicalNumber +
                ", date=" + date +
                '}';
    }
}
