package example.java.collection;

import java.util.HashMap;

/**
 * Project: Java-example
 * Package Name: example.java.collection
 * Created by: krganeshrajhan
 * Description:
 */
public class HashMapExample {


    public HashMap<String, Integer> initialize() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        return map;
    }



    public static void main(String[] args) {

        HashMapExample example = new HashMapExample();
        HashMap<String, Integer> map = example.initialize();
    }
}
