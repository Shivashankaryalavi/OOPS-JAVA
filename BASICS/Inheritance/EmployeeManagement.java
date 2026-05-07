package Inheritance;
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Developer dev1 = new Developer(
                "Shivu",
                55000,
                "Java"
        );

        dev1.displayDetails();
    }
}
