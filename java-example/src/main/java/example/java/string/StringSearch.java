package example.java.string;

import java.util.ArrayList;
import java.util.List;

public class StringSearch {


    public List<Integer> grep(String haystack, String needle) {
        if(haystack==null || haystack.length()==0
                || needle==null || needle.length()==0 ||
                needle.length()>haystack.length()) {
            return new ArrayList<Integer>();
        }
        char[] hays = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int lo = 0;
        int hi = 1;
        int id = 0;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < hays.length; i++) {
            int count = 0;
            for(int j = 0; j < needles.length; j++) {
                System.out.println(i+" "+j+" "+hays[i]+" "+needles[j]);
                if(hays[i]==needles[j]) {
                    count++;
                    if(i<hays.length-1)
                        i++;
                    else
                        break;
                } else {
                    count = 0;
                    break;
                }
                if(count==needles.length) {
                    list.add(i-needles.length);
                    i = i-needles.length;
                    break;
                }
            }
        }

        return list;
    }

    public static void main (String[] args) {
        StringSearch m = new StringSearch();
        System.out.println(m.grep("bbbbbbbbbbb", "bbb"));
    }
}
