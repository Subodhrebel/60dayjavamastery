package Day2;
public class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("(a > 5 && b < 5): " + (a > 5 && b < 5));
        System.out.println("(a > 15 || b < 5): " + (a > 15 || b < 5));
        System.out.println("!(a == b): " + !(a == b));
    }
}