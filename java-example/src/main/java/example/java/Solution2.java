package example.java;

import java.util.*;

public class Solution2 {

    public int[] prisonAfterNDays(int[] cells, int N) {

        int[] newCells = new int[8];
        for(int days=0; days<N;days++) {
            for(int cell=0;cell<8;cell++) {
                if(cell!=0 && cell!=7) {
                    if(cells[cell-1]==cells[cell+1]) {
                        newCells[cell]=1;
                    } else {
                        newCells[cell]=0;
                    }
                }
            }
            cells = Arrays.copyOf(newCells,8);
        }
        return newCells;
    }


    public static void main(String[] args) {

        Solution2 s2 = new Solution2();
//        System.out.println(s2.search(new int[]{2,5,6,0,0,1,2}, 0));
        System.out.println(s2.prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1}, 7));
    }
}

