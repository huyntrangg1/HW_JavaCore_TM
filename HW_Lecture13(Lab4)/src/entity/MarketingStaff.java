package entity;

public class MarketingStaff extends Staff{
    private double revenue;
    private double comissions;


    public MarketingStaff(String name, double salary, double revenue, double comissions) {
        super(name, salary);
        this.revenue = revenue;
        this.comissions = comissions;
    }

    @Override
    public double calIncome() {
     return salary + (revenue*(comissions/100));
    }

    @Override
    public double calVAT() {
        return super.calVAT();
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setComissions(double comissions) {
        this.comissions = comissions;
    }

    @Override
    public String toString() {
        return "MarketingStaff{id=" + getId() + ", name='" + name + ", revenue=" + revenue +
                ", comission=" + comissions + '\''+
                ", salary=" + salary +
                '}';
    }

}
