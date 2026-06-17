
package vu.courseworktwo;

/**
 * Rectangle subclass extending Shape
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) throws InvalidShapeException {
        this("white", false, width, height);
    }

    public Rectangle(String color, boolean filled, double width, double height) throws InvalidShapeException {
        super(color, filled);
        if (width <= 0 || height <= 0) 
            throw new InvalidShapeException("Width and height must be positive");
        this.width = width;
        this.height = height;
    }

    @Override public double getArea() { return width * height; }
    @Override public double getPerimeter() { return 2 * (width + height); }
    
    @Override public void resize(double factor) {
        if (factor <= 0) throw new IllegalArgumentException("Resize factor must be positive");
        width *= factor; 
        height *= factor;
    }
    
    @Override public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + ", " + super.toString() + "]";
    }
}
