package Abstraction;

 abstract class Vehicle{
    public abstract void wheeler();
}
class Bike extends Vehicle{
    @Override
    public void wheeler(){
        System.out.println("Two wheeler");
    }
}
class Car extends Vehicle{
    @Override
    public void wheeler(){
        System.out.println("Four wheeler");
    }
}
class Bus extends Vehicle{
    @Override
    public void wheeler(){
        System.out.println("Eight wheeler");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bus();
        v1.wheeler();
        v2.wheeler();
        v3.wheeler();
    }
}
