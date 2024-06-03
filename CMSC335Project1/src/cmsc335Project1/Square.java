package cmsc335Project1;

/**
 * @author Omoniyi Tomjones
 * Date: October 27, 2023
 * Description: This class represents a Square, which is a two-dimensional shape and a specific type of rectangle.
 * It holds the side length of the square and inherits the area calculation from Rectangle.
 */

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}

