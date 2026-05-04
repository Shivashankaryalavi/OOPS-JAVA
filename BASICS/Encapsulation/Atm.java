package Encapsulation;

public class Atm {
    private int pin;
    private double balance;
    Atm(int pin,double balance){
        this.pin =pin;
        this.balance = balance;
    }
    public void setPin(int pin){
        this.pin=9339;
    }
    public void setDeposit(int pin, int amount){
        if(pin==9339){
            balance+=amount;
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Atm a = new Atm(9339, 2500);
        
    }
}
