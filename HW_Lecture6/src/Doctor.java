public class Doctor extends ManageHospital {
    private String specialist;
    private int workHours;

    public Doctor(int id, String name, int age, String specialist, int workHours) {
        super(id, name, age);
        this.specialist = specialist;
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Ex2: \n- Doctor{" + super.toString() +
                ", specialist='" + specialist + '\'' +
                ", workHours=" + workHours +
                '}';
    }
}
