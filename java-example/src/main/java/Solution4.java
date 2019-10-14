import java.util.Arrays;

public class Solution4 {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int prev = 0;

        if(A[A.length-1] < 0) {
            return 1;
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                continue;
            }
            if(i == 0) {
                prev = A[i];
                continue;
            }

            if(A[i] > prev && (A[i]-prev) == 1) {
                prev = A[i];
                continue;
            } else if(A[i] > prev && (A[i]-prev) > 1) {
                return prev + 1;
            }
        }

        return A[A.length-1]+1;

    }

    public static void main(String[] args) {

        Solution4 solution = new Solution4();
        System.out.println(solution.solution(new int[]{1,3,6,4,1,2}));
        System.out.println(solution.solution(new int[]{1,2,3}));
        System.out.println(solution.solution(new int[]{-1,-3}));
        System.out.println(solution.solution(new int[]{0}));
        System.out.println(solution.solution(new int[]{-100000, 100000}));
    }
}
