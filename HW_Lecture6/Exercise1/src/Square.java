public class Square extends Geometry {
    private double side;
    public Square(double side) { this.side = side; }

    public double getArea() { return side*side; }

    public double getPerimeter()  { return side * 4; }

    public String getResult() {
        return side <= 0 ? "- Square: Invalid side value! Pls change the value of side!"
                : "- Square: The area = " + getArea() + ", The Perimeter = " + getPerimeter();
    }

    //in canh
    public String checkSide() {
        return (side <= 0) ? "Invalid!" : Double.toString(side);
    }

    @Override
    public String toString() {
        return getResult()+ "\n- Square{" +
                "side=" + checkSide() +
                '}';
    }
}
