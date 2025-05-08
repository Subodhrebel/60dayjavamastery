public class UnboxingExample {
    public static void main(String[] args) {
        Integer obj = new Integer(100);
        int num = obj; 
        System.out.println("Wrapped: " + obj);
        System.out.println("Primitive: " + num);
    }
}
