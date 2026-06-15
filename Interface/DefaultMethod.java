package Interface;
interface A{
    void a1();
    void a2();
   
   default void a3(){
    int a =10,b=20,c;
    c=a+b;
    System.out.println("Addition :" + c);
   }
}
class B implements A{
    @Override
    public void a1(){
        System.out.println("B1");
    }
    @Override
    public void a2(){
        System.out.println("B2");
    }
    @Override
    public void a3(){
        System.out.println("Only addition");
    }
}
class C implements A{
    @Override
    public void a1(){
        System.out.println("C1");
    }
    @Override
    public void a2(){
        System.out.println("C2");
    }
}
public class DefaultMethod {
    public static void main(String[] args) {
        B b  = new B();
        b.a1(); b.a2(); b.a3();

        C c = new C();
        c.a1(); c.a2(); c.a3();


        
    }
    
}
