public class Square extends Geometry {
    private double side;

    public Square(double side) {
        if (side > 0) this.side = side;
    }

    public double calArea() {
        return calArearOfSquare(side);
    }

    public double calPerimeter() {
        return calPerimeterOfSquare(side);
    }

    public String printResult() {
        if (side <= 0) {
            return "- Invalid value! Can't calculate the perimeter and area of the square. " +
                    "Pls change the value of side!";
        } else {
            return "- The area of Square = " + calArearOfSquare(side) + " & The Perimeter of Square = "
                    + calPerimeterOfSquare(side);
        }
    }

    public String printSide() {
        if (side <= 0) {
            return "Invalid!";
        }
        return Double.toString(side);
    }

    @Override
    public String toString() {
        return "- Square{" +
                "side=" + printSide() +
                '}';
    }
}
