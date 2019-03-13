import java.util.Arrays;

public class Solution2 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length==0) {
            return null;
        }

        int med = getMedian(nums);
        TreeNode n = new TreeNode(nums[med]);
        if(nums.length!=1) {
            n.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, med-1));
            n.right = sortedArrayToBST(Arrays.copyOfRange(nums, med+1, nums.length-1));
        }

        return n;
    }

    int getMedian(int[] nums) {
        if(nums.length==1) {
            return 0;
        } else {
            return nums.length/2;
        }
    }

    public static void main(String[] args) {

        Solution2 s = new Solution2();
        s.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
