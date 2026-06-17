package ExceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a =10/2;
            System.out.println(a);

            int b[]={1,2,3,4,5};
            System.out.println(b[0]); 

            String c =null;
            System.out.println(c.toUpperCase());
            
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Array out of index");
        }
        catch(NumberFormatException x){
            System.out.println("Null pointer exception");
        }
        catch(Exception y){
            System.out.println("All Exceptions are handled");
        }
    
    }
    
}
