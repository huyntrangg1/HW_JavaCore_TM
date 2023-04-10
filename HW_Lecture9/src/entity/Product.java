package entity;

public class Product {
    private static int autoID;
    private int id;
    private String name;
    private String describe;
    private int quantity;
    private double price;
    private String unitCal;

    public Product() {
        this.id = ++ autoID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnitCal(String unitCal) {
        this.unitCal = unitCal;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", unitCal='" + unitCal + '\'';
    }
}
