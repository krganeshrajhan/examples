package example.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonSecondQuestion {

    int min = -1;
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
    {
        // WRITE YOUR CODE HERE
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        List<List<Integer>> list = new ArrayList<>();
        list.add(arr);
        calculate(0,0,0, area, list);

        return min;

    }

    private void calculate(int r, int c, int count, List<List<Integer>> area, List<List<Integer>> list) {
        if(area.get(r).get(c)==9) {
            if(min==-1 || count<min) {
                min = count;
            }
        } else if(area.get(r).get(c)==0) {
            return;
        }
        if(r>0) {
            loop(r-1, c, count+1, area, list);
        }
        if(c<area.get(0).size()-1) {
            loop(r,c+1,count+1, area, list);
        }
        if(r<area.size()-1) {
            loop(r+1,c,count+1,area, list);
        }
        if(c>0) {
            loop(r,c-1,count+1,area, list);
        }
    }

    private void loop(int r, int c, int count, List<List<Integer>> area, List<List<Integer>> list) {
        final List<Integer> i = new ArrayList<>();
        i.add(r);
        i.add(c);
        if(!list.contains(i)) {
            list.add(i);
            calculate(r, c, count , area, list);
            list.remove(i);
//            count--;
        } else {
            return;
        }
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args){

        AmazonSecondQuestion solution1 = new AmazonSecondQuestion();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(new Integer[]{0,0,0}));
        list.add(Arrays.asList(new Integer[]{1,0,0}));
        list.add(Arrays.asList(new Integer[]{1,9,1}));
        System.out.println(solution1.minimumDistance(3,3, list));
    }
}


