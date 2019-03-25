package example.java.algorithms.paradigm.dynamic.programming;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Entry {

    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
        // your code goes here
    /*
    dict = {
            "Key1" : "1",
            "Key2" : {
                "a" : "2",
                "b" : "3",
                "c" : {
                    "d" : "3",
                    "e" : {
                        "" : "1"
                    }
                }
            }
        }
    */
        System.out.println(dict.toString());
        HashMap<String, String> flattenDict = new HashMap<String, String>();
        for (Map.Entry<String, Object> entry : dict.entrySet()) {
            Object obj = entry.getValue();
//            if(obj.getClass().isPrimitive()) {
                flattenDict.put(entry.getKey(), obj.toString());
//            }

        }
        return flattenDict;
    }

    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("key1",1);
         System.out.println(Entry.flattenDictionary(map));
         LinkedList l;
    }
}
