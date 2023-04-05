public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public String getResult() {
        return (length <= 0 || width <= 0) ? "- Rectangle: Invalid length or width value! Pls change the value of length or width!" :
                "- Rectangle: The area = " + getArea() + ", The Perimeter = " + getPerimeter();
    }
    
    // ktra va in canh:
    public String checkLength() {
        return length <= 0 ? "Invalid!" : Double.toString(length);
    }

    public String checkWidth() {
        return (width <= 0) ? "Invalid!" : Double.toString(width);
    }

    @Override
    public String toString() {
        return getResult() + "\n- Rectangle{" +
                "length=" + checkLength() +
                ", width=" + checkWidth() +
                '}';
    }
}
