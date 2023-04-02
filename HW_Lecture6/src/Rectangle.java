public class Rectangle extends Geometry {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            System.out.println("The value of length or width can't les than or equal zero. Pls enter again:");
        } else {
            this.length = length;
            this.width = width;
        }
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length > 0) {
            this.length = length;
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0) {
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
