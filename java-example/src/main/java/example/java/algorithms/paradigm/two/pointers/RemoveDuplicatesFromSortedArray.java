package example.java.algorithms.paradigm.two.pointers;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        return uniqueValues(nums);
    }

    public int uniqueValues(int[] nums) {

        int i =0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i]!=nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
