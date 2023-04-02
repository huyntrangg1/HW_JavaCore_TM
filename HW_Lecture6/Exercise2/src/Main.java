public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor(1, "Han", 28, "ENT", 51);
        Patient patient = new Patient(1, "Mai", 23, "1234", "2020-12-02");
        System.out.println(doctor + "\n" + patient);
    }
}
