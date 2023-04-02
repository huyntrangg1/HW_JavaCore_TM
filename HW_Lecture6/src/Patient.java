import java.time.LocalDate;


public class Patient extends ManageHospital{
    private int medicalNumber;
    private LocalDate date;

    public Patient(int id, String name, int age, int medicalNumber, LocalDate date) {
        super(id, name, age);
        this.medicalNumber = medicalNumber;
        this.date = date;
    }



    public int getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(int medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public  LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
