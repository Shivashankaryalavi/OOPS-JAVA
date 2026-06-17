package ExceptionHandling;

public class MultiTryCatch {
    public static void main(String[] args) {
        
    try {
        int a=10,b=0,c;
        c=a/b;
        System.out.println(c);
        
    } catch (ArithmeticException e) {
        System.out.println("Can't divide by Zero");
    }
    try{
        int[] a = { 10,20,30,40,50};
        System.out.println(a[5]);
    }
    catch(ArrayIndexOutOfBoundsException b){
        System.out.println("beyond  array");
    }
    System.out.println("Main method ended");
    }
    
}
