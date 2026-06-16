package Collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(25);
        set.add(23);
        set.add(33);
        set.add(43);
        set.add(53);
        
        System.out.println(set);


        set.remove(43);
        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println(set.isEmpty());

        System.out.println(set.size());
        set.clear();
        System.out.println(set);

        System.out.println(set.isEmpty());

        
    }
    
}
