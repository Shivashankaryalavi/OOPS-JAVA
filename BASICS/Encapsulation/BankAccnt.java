package Encapsulation;
import java.util.Scanner;

public class BankAccnt {
    private double balance;

    public void setBalance(double balance){
          if(balance>=0 ){
             this.balance=balance;
          }
          else{
            System.out.println("Invalid balance");
          }
    }
    public void deposit(double amount){
           if(amount>0){
            balance+=amount;
            System.out.println("Balance after deposit : " + balance );
           }
           else{
            System.out.println("Invalid or insufficient amount");
           }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Balance after withdraw : " + balance);
        }
        else{
           System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccnt acc = new BankAccnt();


        System.out.println("Enter initial balance");
        double initial = sc.nextDouble();
        acc.setBalance(initial);

        System.out.println("Enter amount to deposit");
        double amount = sc.nextDouble();
        acc.deposit(amount);

        System.out.println("enter amount to withdraw");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        System.out.println("final balance : " + acc.getBalance());
        sc.close();
        
    }
} 
