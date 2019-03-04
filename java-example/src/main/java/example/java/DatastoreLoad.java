package example.java;

import java.util.*;

public class DatastoreLoad {

    public static void main(String[] args) {

        Map<String, String>[] a = new HashMap[2];
        Map<String, String> m1 = new HashMap<>();
        m1.put("key1", "value1");
        m1.put("key2", "value2");
        Map<String, String> m2 = new HashMap<>();
        m2.put("keyA", "valueA");
        a[0] = m1;
        a[1] = m2;
        String text = store(a);
        Map<String, String>[] b = load(text);
        System.out.print(b);
    }

    private static Map<String, String>[] load(String text) {

        String[] items = text.split("\n");
        Map<String, String>[] array = new HashMap[items.length];
        int i =0;
        for(String item : items) {

            String[] dictionaries = item.split( ";");
            Map<String, String> map = new HashMap<>();
            for(String dictionary : dictionaries) {

                String[] keyValue = dictionary.split("=");
                map.put(keyValue[0], keyValue[1]);
            }
            array[i++] = map;
        }
        return array;
    }

    private static String store(Map<String, String>[] a) {

        StringJoiner mapJoiner = new StringJoiner("\n");

        for(Map<String, String> map : a) {

            StringJoiner join = new StringJoiner(";");
            for(Map.Entry<String, String> entry : map.entrySet()) {

                join.add(entry.getKey()+"="+entry.getValue());
            }
            mapJoiner.add(join.toString());
        }
        return mapJoiner.toString();
    }

}
