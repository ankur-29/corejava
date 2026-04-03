package exception;

public class TestException {

    // using 'throws' → declaring exception
    public static void validateAge(int age) throws AnkurException {

        if (age < 18) {
            // using 'throw' → actually throwing exception
            throw new AnkurException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(15); // calling method
        } catch (AnkurException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}