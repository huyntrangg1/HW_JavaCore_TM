package entity;

public class Administrative extends Staff{
    public Administrative(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calIncome() {
        return salary;
    }

    @Override
    public double calVAT() {
        return super.calVAT();
    }

    @Override
    public String toString() {
        return "Administrative{id=" +  getId() +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
