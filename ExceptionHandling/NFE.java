
// NUMBER FORMAT EXCEPTION
package ExceptionHandling;

public class NFE {
    public static void main(String[] args) {
        String str= "Shiva";
        try{
            int a =Integer.parseInt(str); 
            System.out.println(a);

           
        }
        catch(NumberFormatException n){
            System.out.println("String  "+ str + " cannot converted to integer");

        }
        System.out.println("Main method Ended");
    }
}
