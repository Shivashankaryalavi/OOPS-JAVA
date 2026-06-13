package Abstraction;

 abstract class Pets {
    abstract void sound(); 
}
 class Dog extends Pets{
    void sound(){
        System.out.println("Barking");
    }
}
class Cat extends Pets{
    void sound(){
        System.out.println("Meow Meow");
    }
}
public  class Animal{
    public static void main(String[] args) {
     Pets p1 = new Dog();
        Pets p2 = new Cat();
       p1.sound();
        p2.sound();

    }
}

