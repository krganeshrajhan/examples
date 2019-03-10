package example.java.algorithms.paradigm.two.pointers;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = nums1.length - nums2.length -1;
        int p2 = nums1.length - 1;
        int p3 = nums2.length - 1;

        while(p1>=0 && p3>=0) {
            if(nums1[p1]<=nums2[p3]) {
                nums1[p2--] = nums2[p3--];
            } else {
                nums1[p2--] = nums1[p1--];
            }
        }
        if(p1<0)
            System.arraycopy(nums2, 0, nums1, 0, p3 + 1);
    }

}
