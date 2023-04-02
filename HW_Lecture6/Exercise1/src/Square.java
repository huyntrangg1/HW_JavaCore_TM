public class Square extends Geometry {
    private double side;
    public Square(double side) { this.side = side; }

    public String cal() {
        String result;
        if (side <= 0) {
            result = "- Square: Invalid side value! Can't calculate the perimeter and area. "
                    + "Pls change the value of side!";
        } else {
            double area = calAreaOfSquare(side); //tinh dien tich
            double perimeter = calPerimeterOfSquare(side); //tinh chu vi
            result = "- Square: The area = " + area + ", The Perimeter = " + perimeter;
        }
        System.out.println(result);
        return result;
    }

    //in canh
    public String printSide() {
        return (side <= 0) ? "Invalid!" : Double.toString(side);
    }

    @Override
    public String toString() {
        return "- Square{" +
                "side=" + printSide() +
                '}';
    }
}
