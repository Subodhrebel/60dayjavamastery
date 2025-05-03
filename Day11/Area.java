class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle = length * breadth");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = π * radius * radius");
    }
}

public class Area {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.area();

        s = new Circle();
        s.area();
    }
}
