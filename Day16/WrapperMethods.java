public class WrapperMethods {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);  
        System.out.println("Parsed int: " + num);
        
        int x = 45;
        String s = Integer.toString(x);  
        System.out.println("Converted to String: " + s);
    }
}
