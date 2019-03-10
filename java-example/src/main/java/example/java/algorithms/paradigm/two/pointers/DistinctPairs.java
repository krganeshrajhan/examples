package example.java.algorithms.paradigm.two.pointers;

import java.util.*;

public class DistinctPairs {

    public int numberOfPairs(List<Integer> a, long k) {
        // Write your code here
        if(a== null || a.isEmpty()) {
            return 0;
        }
        Collections.sort(a);
        int low=0;
        int high=a.size()-1;
        int numberOfPairs = 0;

        while(low<high) {
            if(a.get(low)+ a.get(high)==k) {
                numberOfPairs++;
                while(low<high && a.get(low)==a.get(low+1))
                    low++;
                while(low<high && a.get(high)==a.get(high-1))
                    high--;
                low++;
                high--;

            } else if(a.get(low)+a.get(high)<k)
                low++;
            else
                high--;
        }
        return numberOfPairs;
    }

    int pairs(int k, int[] arr) {
        int i = 010;

        if(arr== null) {
            return 0;
        }
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int numberOfPairs = 0;

        while(low<high) {
            if(arr[low]+ arr[high]==k) {
                numberOfPairs++;
                while(low<high && arr[low]==arr[low+1])
                    low++;
                while(low<high && arr[high]==arr[high-1])
                    high--;
                low++;
                high--;
            } else if(arr[low]+arr[high]<k)
                low++;
            else
                high--;
        }
        return numberOfPairs;

    }

    public static void main(String[] args) {
        int i;

        DistinctPairs distinctPairs = new DistinctPairs();
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(46);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(47);
        System.out.println(distinctPairs.numberOfPairs(list, 47));
        int x =5;
        int y = 10;

        x = x^ y;
        System.out.println(x);
    }
}
