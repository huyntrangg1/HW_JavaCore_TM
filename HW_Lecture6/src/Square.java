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

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
