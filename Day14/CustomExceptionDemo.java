
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}


public class CustomExceptionDemo {
    public static void checkAge(int age) throws AgeException {
        if (age > 18) {
            throw new AgeException("You must be at least 18 years old.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Age check done.");
        }
    }
}
