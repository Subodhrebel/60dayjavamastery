package Day2;
public class DataTypeExample {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isEmployed = true;
        String name = "Subodh Kumar";
        Person person = new Person();
        person.name = name;
        person.age = age;
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
}

class Person {
    String name;
    int age;
}
