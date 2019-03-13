package example.java.algorithms.paradigm.dynamic.programming.memoization;

public class ClimbStairs {

    public static int climbStairs(int n) {
        int[] memo = new int[n+1];
        memo[0] = 1;
        return climbStairs(n,memo);
    }

    private static int climbStairs(int n, int[] memo) {

        if(n<0) {
            return 0;
        }

        if(memo[n]>0) {
            return memo[n];
        }

        memo[n] = climbStairs(n-1, memo) +climbStairs(n-2,memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(ClimbStairs.climbStairs(3));
    }
}
