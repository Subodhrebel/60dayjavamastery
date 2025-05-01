class Counter {
    static int count = 0;

    Counter() {
        count++; 
        System.out.println("Object created. Count: " + count);
    }

    static void showCount() {
        System.out.println("Total objects created: " + count);
    }

    static {
        System.out.println("Static block: Class Counter loaded.");
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        Counter.showCount(); 
    }
}
