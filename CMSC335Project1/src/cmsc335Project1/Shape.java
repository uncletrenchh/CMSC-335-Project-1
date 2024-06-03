package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This is an abstract class that represents a generic geometric shape.
 * It holds the number of dimensions that a shape has.
 */

public abstract class Shape {
    int numberOfDimensions;

    public Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public int getNumberOfDimensions() {
        return this.numberOfDimensions;
    }
}
