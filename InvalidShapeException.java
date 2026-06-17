package vu.courseworktwo;

/**
 * Custom checked exception for invalid shape dimensions.
 * It is checked (extends Exception) so that callers must handle it.
 */
public class InvalidShapeException extends Exception {
    public InvalidShapeException(String message) {
        super(message);
    }
}
