public class Student {
    
    String name;
    int age;
    String course;

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 20;
        s1.course = "Computer Science";

        Student s2 = new Student();
        s2.name = "subodh";
        s2.age = 21;
        s2.course = "Information Technology";

        
        s1.displayDetails();
        System.out.println("--------------------");
        s2.displayDetails();
    }
}
