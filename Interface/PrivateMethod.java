package Interface;

interface A{
    default void call(){
        add(100,200);

    } 
    private  void add(int x,int y){
        System.out.println("Addition :" + (x+y));
    }
}
class B implements A{
    public void sub(int x, int y){
        System.out.println("Substraction" + (x-y));
    }
}

public class PrivateMethod {
    public static void main(String[] args){
        B b =new B();
         b.call();
        b.sub(200,100);
      
    }
    
}
