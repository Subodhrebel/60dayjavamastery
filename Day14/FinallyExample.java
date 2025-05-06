public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("finally block executed");
        }
    }
}
