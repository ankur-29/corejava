package exception;

// Custom Exception
public class AnkurException extends Exception {

    // Default constructor
    public AnkurException() {
        super("Something went wrong!");
    }

    // Parameterized constructor
    public AnkurException(String message) {
        super(message);
    }
}