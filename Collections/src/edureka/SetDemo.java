package edureka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] strings) {
//        HashSet<String> set = new HashSet<>();
        TreeSet<String> set = new TreeSet<>();  // Data is unordered but it is alphabetically sorted
        // Here data is not added as in indexing approach
        // We got hashCodes for elements which are being added
        set.add("John");
        set.add("Jennie");
        set.add("John");
        set.add("Becca");
        set.add("Jim");
        set.add("Jack");
        set.add("Albert");
        set.add("John");
        set.add("Kyle");
        set.add("Joe");
        // 1. Data is unique, no Redundancy
        // 2. Data is unordered in output due to hashing
        System.out.println("set is : " + set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
        set.remove("Jim");
        if(set.contains("John")) {
            System.out.println("John is in the set");
        }
        System.out.println("set size is : " + set.size());
    }
}
