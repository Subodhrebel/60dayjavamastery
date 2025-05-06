public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int x = arr[5]; 
            int y = 10 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e);
        } finally {
            System.out.println("Multiple catch blocks tested.");
        }
    }
}
