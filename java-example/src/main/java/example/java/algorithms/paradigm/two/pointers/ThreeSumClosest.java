package example.java.algorithms.paradigm.two.pointers;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for(int pointer=0; pointer<nums.length-2; pointer++) {
            if(pointer==0 || pointer!=nums.length-3 || (pointer>0 && nums[pointer]!=nums[pointer+1])) {
                int lo = pointer+1;
                int hi = nums.length-1;
                int sum = target - nums[pointer];
                while(lo<hi) {
                    if(Math.abs(nums[pointer]+nums[lo]+nums[hi]-target)<Math.abs(closest)) {
                        closest = nums[pointer]+nums[lo]+nums[hi];
                        while(lo<hi && nums[lo]==nums[lo+1])
                            lo++;
                        while(lo<hi && nums[hi]==nums[hi-1])
                            hi--;
                        if(Math.abs(nums[lo]-nums[lo+1]) < Math.abs(nums[hi]-nums[hi-1]))
                            lo++;
                        else
                            hi--;
                    } else if(nums[pointer]+nums[lo]+nums[hi]< target)
                        lo++;
                    else
                        hi--;

                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        threeSumClosest.threeSumClosest(new int[]{-1,2,1,-4},1);
    }
}
