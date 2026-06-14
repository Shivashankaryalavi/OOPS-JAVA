package Interface;

interface client{
    void webdesign();
    void webdevelop();
}
 abstract class RajTech implements client {
    @Override
    public void webdesign(){
       
        System.out.println("Green,top menu ,three dot button ");
    }
 }
class ShivTech extends RajTech{
    @Override
    public void webdevelop(){
        System.out.println("HTML CSS JavaScript");
    }
} 

public class Interface2 {
    public static void main(String[] args) {
        client s = new ShivTech();
        s.webdesign();
        s.webdevelop();
      
    }
    
}
