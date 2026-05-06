package Inheritance;


class Employee {

    String company = "Infosys";

    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    String language = "Java";

    public void coding() {
        System.out.println("Developer uses " + language);
    }
}

public class Main {

    public static void main(String[] args) {

        Developer d1 = new Developer();

        System.out.println("Company : " + d1.company);

        d1.work();

        d1.coding();
    }
}