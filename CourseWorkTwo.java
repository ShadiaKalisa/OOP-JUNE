
package vu.courseworktwo;

public class CourseWorkTwo {
    public static void printAreas(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println("Area of " + s + " is " + s.getArea());
        }
    }

    public static Shape largest(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) return null;
        Shape max = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > max.getArea()) {
                max = s;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try {
            new Triangle(1, 1, 3); // invalid triangle
        } catch (InvalidShapeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
            };

            printAreas(shapes);
            System.out.println("Largest shape: " + largest(shapes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}