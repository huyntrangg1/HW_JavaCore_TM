import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManageHospital {
    private Doctor doctor;
    private Patient patient;

            public ManageHospital() {
            doctor = new Doctor(1, "Han", 33, "ENT", 56);
            patient = new Patient(1, "Mai", 223, "1234", "2020-12-02");
        }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    private class Doctor extends Person {
            private String specialist;
            private int workHours;

            public Doctor(int id, String name, int age, String specialist, int workHours) {
            super(id, name, age);
            this.specialist = specialist;
            this.workHours = workHours;
        }

        private String checkHours() {
            return (workHours <0) ? "Invalid working hours!": Integer.toString(workHours);
        }

        @Override
        public String toString() {
            return "- Doctor{" + super.toString() +
                    ", specialist='" + specialist + '\'' +
                    ", workHours=" + checkHours() +
                    '}';
        }
    }

    private class Patient extends Person {
        private String medicalNumber;
        private String date;

        public Patient(int id, String name, int age, String medicalNumber, String date) {
            super(id, name, age);
            this.medicalNumber = medicalNumber;
            this.date = date;
        }

        //chuyen String thanh dang Date:
        private LocalDate getDate() {
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
}

