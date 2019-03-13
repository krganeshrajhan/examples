package example.java.algorithms.paradigm.dynamic.programming.bottom.up;

public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(ClimbStairs.climbStairs(3));
    }

    private static int climbStairs(int n) {

        int[] climbs = new int[n+1];
        climbs[0] = 1;
        climbs[1] = 1;

        for(int stair=2; stair<=n;stair++) {
            climbs[stair] = climbs[stair-1] + climbs[stair-2];
        }
        return climbs[n];
    }
}
