package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

      //Add elements to list
       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(7);
       list.add(9);
       System.out.println(list);

       //Add another element it will add in last
       list.add(4);
       System.out.println(list);

      // Add element through index 
       list.add(1,10);
       System.out.println(list);


       // Add elements for newlist and ccopied to existing list
       List<Integer> newlist = new ArrayList<>();
       newlist.add(150);
       newlist.add(160);
       list.addAll(newlist);
       System.out.println(list);
   
      // to print all method using for loop 
       for(int i=0;i<list.size();i++){
        System.out.println("The element is : "+ list.get(i));
       }


      // Using for each method 
       for(Integer element :list){
          System.out.println("for each elemt :" + element);
       }

       //Using iterator
       Iterator<Integer> it = list.iterator();

       while(it.hasNext()){
        System.out.println("Iterator :" + it.next());
       }

       // To get a value 
       System.out.println(list.get(1));
  
       // to remove value through index
       list.remove(1);
       System.out.println(list);
        
       //to remove direct value
       list.remove(Integer.valueOf(160));
       System.out.println(list);

    //to set a values like updating existing value
       list.set(4,140);
       System.out.println(list);

     // to check value is it existing or not
       System.out.println(list.contains(50));

    // returns the first occurance index
    System.out.println(list.indexOf(140));

     list.add(150);
     System.out.println(list.lastIndexOf(150));

     Collections.sort(list);
     System.out.println(list);

     Collections.reverse(list);
     System.out.println(list);

    


     System.out.println(list.containsAll(newlist));


     //Returns the number of elements
     System.out.println(list.size());

    //To clear all list
       list.clear();
       System.out.println(list);

    // check whether list is empty
    System.out.println(list.isEmpty());



    }
    
}
