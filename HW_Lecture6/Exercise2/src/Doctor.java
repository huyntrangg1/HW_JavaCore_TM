public class Doctor extends ManageHospital {
    private String specialist;
    private int workHours;

    public Doctor(int id, String name, int age, String specialist, int workHours) {
        super(id, name, age);
        this.specialist = specialist;
        this.workHours = workHours;
    }

    public String checkHours() {
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
