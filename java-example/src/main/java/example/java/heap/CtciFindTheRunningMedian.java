package example.java.heap;

import java.util.*;

public class CtciFindTheRunningMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.println(findMedian(a_i, list));

        }
    }

    private static float findMedian(int a_i, List<Integer> a) {
        Collections.sort(a);
        if(a_i==0) {
            return (float) a.get(0);
        } else if (a_i%2==0) {
            return (float) a.get(a_i/2);
        } else {
            int i = a_i/2;
            return ((float)(a.get(i)+a.get(i+1))/2);
        }
    }
}
