package example.java.collection.set.hashset;

import java.util.HashSet;

/**
 * Created by 1532082 on 3/22/2017.
 */
public class HashSetExample {
    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add("F");
        System.out.println(hs);
    }
}
