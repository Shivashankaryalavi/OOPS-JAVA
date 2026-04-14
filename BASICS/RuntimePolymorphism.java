class Employee{
    void work(){
        System.out.println("He works for company");
    }
}
class Developer extends Employee{
    @Override

    void work(){
       
        System.out.println("Developing Application");
    }
}
public class RuntimePolymorphism {
     public static void main(String[] args) {
        Employee e = new Developer();
        e.work();
     }
    
}
