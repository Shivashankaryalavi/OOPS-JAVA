package Inheritance;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }
}

class Car extends Vehicle {
    int speed;

    Car(String brand, int speed) {
        super(brand);  
        this.speed = speed; 
    }

    void display() {
        System.out.println("Brand: " + brand); 
        System.out.println("Speed: " + speed);
    }
}

public class Singlelevel {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 120); 

        c.start();   
        c.display(); 
    }
}