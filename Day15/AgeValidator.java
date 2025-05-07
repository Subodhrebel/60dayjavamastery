
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class AgeValidator {
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age > 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid. Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            int userAge = 16; 
            validateAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception: " + e);
        } finally {
            System.out.println("Validation process completed.");
        }
    }
}
