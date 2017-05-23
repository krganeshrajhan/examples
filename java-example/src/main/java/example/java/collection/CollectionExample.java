package example.java.collection;

import java.util.*;

/**
 * Created by 1532082 on 3/27/2017.
 */
public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);

        // Size
        System.out.println("ArrayList size: "+a1.size());
        System.out.println("LinkedList size: "+l1.size());
        System.out.println("Set size: "+s1.size());
        System.out.println("Map size: "+m1.size());

        //isEmpty
        System.out.println("ArrayList Empty: "+a1.isEmpty());
        System.out.println("LinkedList Empty: "+l1.isEmpty());
        System.out.println("HashSet size: "+s1.isEmpty());
        System.out.println("HashMap size: "+m1.isEmpty());

        //  contains
        System.out.println("ArrayList Contains: "+a1.contains("Zara"));
        System.out.println("LinkedList Contains: "+l1.contains("Zara"));
        System.out.println("HashSet Contains: "+s1.contains("Zara"));
        System.out.println("HashMap Contains: "+m1.containsKey("Zara"));

    }
}
