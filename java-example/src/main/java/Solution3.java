import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution3 {


    public boolean solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;
        int first = (length/2) - 1;
        int second = (length/2) + 1;

        return isDistributionPossible(A, first, second);
//
//        int sum1 = IntStream.of(Arrays.copyOfRange(A,0, first)).sum();
//        int sum2 = IntStream.of(Arrays.copyOfRange(A, first+1, second)).sum();
//        int sum3 = IntStream.of(Arrays.copyOfRange(A, second+1,A.length)).sum();
//        return isDistributionPossible(A, sum1, sum2, sum3));
    }

    /*private boolean isDistributionPossible(int[] a, int[] copyOfRange, int[] copyOfRange1) {

        boolean isSumEqual  = isSumEqual(a, copyOfRange, copyOfRange1);

        if(isSumEqual) {
            return true;
        } else if(isDistributionPossible(a, first-1, second)){
            return true;
        } else if(isDistributionPossible(A, first, second+1)) {
            return true;
        }
    }*/

    private boolean isSumEqual(int[] a, int[] copyOfRange, int[] copyOfRange1) {
        int sum1 = IntStream.of(a).sum();
        int sum2 = IntStream.of(copyOfRange).sum();
        int sum3 = IntStream.of(copyOfRange1).sum();
        return (sum1 == sum2 && sum2 == sum3);
    }

    private boolean isDistributionPossible(int[] A, int first, int second) {

        if(first == 0 || second == (A.length-1)) {
            return false;
        }

        boolean isSumEqual = isSumEqual(A, first, second);
        if(isSumEqual) {
            return true;
        } else if(isDistributionPossible(A, first-1, second)){
            return true;
        } else if(isDistributionPossible(A, first, second+1)) {
            return true;
        }

        return false;
    }

    private boolean isSumEqual(int[] A, int first, int second) {

        int sum1 = IntStream.of(Arrays.copyOfRange(A,0, first)).sum();
        int sum2 = IntStream.of(Arrays.copyOfRange(A, first+1, second)).sum();
        int sum3 = IntStream.of(Arrays.copyOfRange(A, second+1,A.length)).sum();
        return (sum1 == sum2 && sum2 == sum3);
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(new int[]{1,3,4,2,2,2,1,1,2}));
        int[] a = new int[20000];
        for(int i : a) {

        }
        System.out.println(solution3.solution(a));
    }
}
