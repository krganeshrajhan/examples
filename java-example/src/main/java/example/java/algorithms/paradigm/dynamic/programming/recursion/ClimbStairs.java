package example.java.algorithms.paradigm.dynamic.programming.recursion;

public class ClimbStairs {

    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    public int climbStairs(int i, int n) {
        if(i>n)
            return 0;
        if(i==n)
            return 1;
        return climbStairs(i+1,n) + climbStairs(i+2,n);
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(43));
    }
}
