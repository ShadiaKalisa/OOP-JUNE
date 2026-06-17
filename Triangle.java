package vu.courseworktwo;

/**
 * Triangle subclass extending Shape.
 * Includes triangle inequality validation.
 */

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) throws InvalidShapeException {
        this("white", false, s1, s2, s3);
    }

    public Triangle(String color, boolean filled, double s1, double s2, double s3) throws InvalidShapeException {
        super(color, filled);
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) 
            throw new InvalidShapeException("All sides must be positive");
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1)
            throw new InvalidShapeException("Sides violate triangle inequality");
        
        this.side1 = s1; 
        this.side2 = s2; 
        this.side3 = s3;
    }

    @Override public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override public double getPerimeter() { 
        return side1 + side2 + side3; 
    }
    
    @Override public void resize(double factor) {
        if (factor <= 0) throw new IllegalArgumentException("Resize factor must be positive");
        side1 *= factor; 
        side2 *= factor; 
        side3 *= factor;
    }
    
    @Override public String toString() {
        return "Triangle[sides=" + side1 + "," + side2 + "," + side3 + ", " + super.toString() + "]";
    }
}
