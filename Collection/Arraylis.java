package Collection;
import java.util.ArrayList;

public class Arraylis {

    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("JAVA");
        list1.add("Python");
        list1.add("C++");

        // Clone()

       // ArrayList<String> list2 =(ArrayList<String> )list1.clone();


       //(Most prefered method to copy)  is Copy nconstructor ArrayList<>(newList)

       ArrayList<String> list2 = new ArrayList<>(list1);

        System.out.println("List1 :" + list1);
        System.out.println("List2 copied :"+ list2);
        list2.add("Django");

        list2.addAll(list1);
        System.out.println(list2);
        

    }
    
}
