package vu.courseworktwo;

/**
 * Circle subclass that inherits from Shape.
 * Demonstrates inheritance and polymorphism.
 */

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws InvalidShapeException {
        this("white", false, radius);
    }

    public Circle(String color, boolean filled, double radius) throws InvalidShapeException {
        super(color, filled);
        if (radius <= 0) throw new InvalidShapeException("Radius must be positive");
        this.radius = radius;
    }

    @Override public double getArea() { return Math.PI * radius * radius; }
    @Override public double getPerimeter() { return 2 * Math.PI * radius; }
    
    @Override public void resize(double factor) {
        if (factor <= 0) throw new IllegalArgumentException("Resize factor must be positive");
        radius *= factor;
    }
    
    @Override public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}
