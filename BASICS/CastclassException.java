
 class Animal {
    String name;
    String color;
    int price;
}
 class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class CastclassException {
      public static void main(String[] args) {
            Animal a1 = new Dog();
            Animal a2= new Cat();
            if(a1 instanceof Dog ){
                Dog d = (Dog)a1;    
                d.sound();
            }
            if (a2 instanceof Cat){
                Cat c = (Cat)a2;
                c.sound();
            }

      }
    
}
