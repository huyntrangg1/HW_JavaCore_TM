public class Doctor extends ManageHospital{
    private String specialist;
    private int workHours;

    public Doctor(int id, String name, int age, String specialist, int workHours) {
        super(id, name, age);
        this.specialist = specialist;
        this.workHours = workHours;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                ", specialist='" + specialist + '\'' +
                ", workHours=" + workHours +
                '}';
    }
}
