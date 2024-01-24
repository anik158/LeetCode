package e_climbing_chairs;

public class ClimbingChairs {

    public static void main(String[] args) {
        int n = 5;
        int ways = climbStairs(n);
        System.out.println("Number of distinct ways to climb " + n + " steps: " + ways);
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] ways = new int[n+1];
        ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }
}
