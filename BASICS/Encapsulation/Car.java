package Encapsulation;
public class Car {
         private String brand;
         private String color;
         private double price;
         private int speed;

         Car(String brand ,String color,double price,int speed){
            this.brand=brand;
            this.color=color;
            this.price = price;
         
            if(speed<0 || speed>140){
                System.out.println("That much speed not permitted");
                this.speed =0;
            }
            else{
                this.speed=speed;
            }
         }
         public void setSpeed(int speed){
            if(speed>=0 &&speed<=140){
                this.speed=speed;
            }
            else{
                System.out.println("Not permitted");
            }
         }
         public void getDetails(){
            System.out.println(" Car Details : ");
            System.out.println("Brand : " + brand);
            System.out.println("Color : " + color);
            System.out.println("Price : "+ price);
            System.out.println("Speed : "+ speed);
         }

         public int getSpeed(){
            return speed;
         }
         public static void main(String[] args) {
            Car c = new Car("BMW", "Black", 2500000.00, 120);
            c.getDetails();
             
         }
    
}