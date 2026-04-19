interface Calci{
    int add(int a,int b);
}
class Task implements Calci{
    public int add(int a ,int b){
        return a+b;
    }
}
public class Abstract {
    public static void main(String[] args) {
        //upcasting 
        Calci c = new Task();
        System.out.println(c.add(1, 2));
   //OR 
        /*
        Task t = new task();
        System.out.print(t.add(1,3));   //4

         */
        

    }

    
}
