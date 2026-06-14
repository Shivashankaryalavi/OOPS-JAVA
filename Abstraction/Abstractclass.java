package Abstraction;

abstract class Animal{
    Animal(){
        System.out.println("All animals");
    }
     public abstract void sound();
}
class Dog extends Animal{
     public  void sound(){
        System.out.println("Dog is barking");
    }
}
class Lion extends Animal{
    public void sound(){
        System.out.println("Lion is roaring");
    }

}

public class Abstractclass {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Lion();
        a1.sound();
        a2.sound();
    }
    
}
