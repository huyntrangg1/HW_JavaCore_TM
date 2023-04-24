package entity;

public class Manager extends Staff{
    private double responsibilitySalary;

    public Manager(String name, double salary, double responsibilitySalary) {
        super(name, salary);
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public double calIncome() {
        return salary +responsibilitySalary;
    }

    @Override
    public double calVAT() {
        return super.calVAT();
    }

    public void setResponsibilitySalary(double responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public String toString() {
        return "Manager{id=" + getId() + ", name='" + name +
                ", responsibilitySalary=" + responsibilitySalary +'\''+
                ", salary=" + salary +
                '}';
    }
}
