package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This is an abstract class that represents a two-dimensional shape.
 * It extends the Shape class and includes an abstract method to get the area of the shape.
 */

public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape() {
        super(2);
    }

    abstract double getArea();
}
