
class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
        System.out.println("Employee constructor called.");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId); 
        this.department = department;
        System.out.println("Manager constructor called.");
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}


class Developer extends Manager {
    String techStack;

    Developer(String name, int empId, String department, String techStack) {
        super(name, empId, department); // constructor chaining
        this.techStack = techStack;
        System.out.println("Developer constructor called.");
    }

    void displayDeveloper() {
        displayInfo();       
        displayManager();    
        System.out.println("Tech Stack: " + techStack);
    }
}


public class TestInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Subodh", 101, "IT", "Java");
        dev.displayDeveloper();
    }
}
