
package vu.courseworktwo;

/**
 * Abstract superclass Shape that demonstrates abstraction.
 * It defines common properties and abstract methods that all shapes must implement.
 */

public abstract class Shape {
    protected String color = "white";
    protected boolean filled;

    public Shape() {
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void resize(double factor);

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
