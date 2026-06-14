package Interface;
import java.util.Scanner;
interface client{
    void input();//public+abstract
    void output();//public+abstract
}
class Shivu implements client{
    String name;double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        name=sc.nextLine();
        System.out.println("Enter Salary");
        sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+ ">>>" + sal );
    }
}

public class Interface1 {
    public static void main(String[] args) {
        client c = new Shivu();
        c.input(); c.output();
    }
    
}
