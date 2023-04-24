package entity;

public abstract class Staff {
    private static int autoId;
    private int id;
   protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calIncome();
    public double calVAT() {
        return calIncome()>=11? 0 : 0.1 * (calIncome()-11);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
