public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String cal() {
        String result;
        if (length <= 0 || width <= 0) {
            result = "Ex1:\n- Rectangle: Invalid length or width value! Can't calculate the perimeter and area. " +
                    "Pls change the value of length or width!";
        } else {
            double area = calAreaOfRec(length, width); //tinh dien tich
            double perimeter = calPerimeterOfRec(length, width); //tinh chu vi
            result = "Ex1.\n- Rectangle: The area = " + area + ", The Perimeter = " + perimeter;
        }
        System.out.println(result);
        return result;
    }

    // in canh:
    public String printLength() {
        return (length <= 0) ? "Invalid!" : Double.toString(length);
    }

    public String printWidth() {
        return (width <= 0) ? "Invalid!" : Double.toString(width);
    }

    @Override
    public String toString() {
        return "- Rectangle{" +
                "length=" + printLength() +
                ", width=" + printWidth() +
                '}';
    }
}
