class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
    }
}

class Manager {
    public static void main(String[] args) {
        Employee emp = new Employee("Subodh", 55000);
        emp.setName("Jane Doe");
        emp.setSalary(545000);
        emp.displayDetails();
    }
}
