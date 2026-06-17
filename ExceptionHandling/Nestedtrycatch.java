package ExceptionHandling;

public class Nestedtrycatch {
    public static void main(String[] args){
        try{

            try{
                int a[]= {10,20,30,40};
                System.out.println(a[2]);

            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.print(a);

            }
            System.out.println(10/0);

        }
        catch(ArithmeticException e){
            System.out.println("cant divide by zero");

        }
        System.out.print("Learn coding");
    }
    
}
