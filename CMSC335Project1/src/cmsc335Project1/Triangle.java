package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This class represents a Triangle, which is a two-dimensional shape.
 * It holds the base and height of the triangle and includes a method to calculate the area.
 */

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}
