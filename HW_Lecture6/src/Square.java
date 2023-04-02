public class Square extends Geometry {
    private double side;


    public Square(double side) {
        if (side > 0) this.side = side;

    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) this.side = side;
    }
    public String  printResult() {
        if (side <= 0) {
            return "Can't calculate the value of perimeter and area. Pls change the value of side!";
        } else {
            return "The area of Square = " + calArearOfSquare(side) + "\nThe Perimeter of Square = "
                    + calPerimeterOfSquare(side)+"!";
        }
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
