package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This class represents a Rectangle, which is a two-dimensional shape.
 * It holds the length and width of the rectangle and includes a method to calculate the area.
 */

public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}
