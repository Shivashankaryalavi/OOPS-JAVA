package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkHashset {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(23);
        set.add(33);
        set.add(43);
        set.add(53);
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
