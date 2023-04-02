public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length > 0 || width > 0) {
            this.length = length;
            this.width = width;
        }
    }

    public double calArea() {
        return calAreaOfRec(length, width);
    }

    public double calPerimeter() {
        return calPerimeterOfRec(length, width);
    }

    public String printResult() {
        if (length <= 0 || width <= 0) {
            return "Ex1: \n- Invalid value! Can't calculate the perimeter and area of the rectangle. " +
                    "Pls change the value of length & width!";
        } else {
            return "1. The area of Rectangle = " + calAreaOfRec(length, width) + "\tThe Perimeter of Rectangle = "
                    + calPerimeterOfRec(length, width) + "!";
        }
    }

    // in canh:
    public String printLength() {
        if (length <= 0) {
            return "Invalid!";
        }
        return Double.toString(length);
    }

    public String printWidth() {
        if (width <= 0) {
            return "Not valid!";
        }
        return Double.toString(width);
    }

    @Override
    public String toString() {
        return "- Rectangle{" +
                "length=" + printLength() +
                ", width=" + printWidth() +
                '}';
    }
}
