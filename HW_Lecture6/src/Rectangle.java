public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length <=  0 || width <= 0) {
            System.out.println("Length or width can't less than or equal 0.");
        } else {
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

    public String  printResult() {
        if (length <= 0 || width <= 0) {
           return "Can't calculate the value of perimeter and area. Pls change the value of length & width!";
        } else {
            return "The area of Rectangle = " + calAreaOfRec(length, width) + "\nThe Perimeter of Rectangle = "
                    + calPerimeterOfRec(length, width)+"!";
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
