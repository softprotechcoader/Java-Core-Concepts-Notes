// Base class Employee
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Derived class Manager
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

   
    public void getDetails() {
        super.getDetails();
        System.out.println("Department: " + department);
    }
}

// Main class Exercise7
class Exercise7 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000.0);
        emp.getDetails();

        Manager mgr = new Manager("Bob", 80000.0, "IT");
        mgr.getDetails();
    }
}