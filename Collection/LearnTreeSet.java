package Collection;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(23);
        set.add(13);
        set.add(43);
        set.add(9);
        set.add(63);

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
