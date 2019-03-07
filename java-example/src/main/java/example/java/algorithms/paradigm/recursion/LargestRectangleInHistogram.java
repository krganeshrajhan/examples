package example.java.algorithms.paradigm.recursion;

import java.util.Arrays;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {

        int largestRectangle =0;

        for(int ind=0; ind<heights.length;ind++) {

            int height = heights[ind];
            int maximumWidth = getMaximumWidth(ind, heights, height);
            int rectangle = height * maximumWidth;
            if(largestRectangle < (rectangle))
                largestRectangle = rectangle;
        }

        return largestRectangle;
    }

    public int getMaximumWidth(int ind, int[] heights, int heightLimit) {

        if(ind<0 || ind>heights.length-1)
            return 0;

        int height = heights[ind];
        int width = 0;
        if(height >=heightLimit) {
            width += 1;
            width += getMaximumWidth(ind-1, Arrays.copyOfRange(heights,0,ind), heightLimit);
            width += getMaximumWidth(0, Arrays.copyOfRange(heights, ind+1, heights.length), heightLimit);
        }
        return width;

    }


}
