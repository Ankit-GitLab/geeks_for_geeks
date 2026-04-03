//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[3];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++){
            dp[2] = cost[i] + Math.min(dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return Math.min(dp[0], dp[1]);
    }
    
    // static int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int[] dp = new int[n];
    //     dp[0] = cost[0];
    //     dp[1] = cost[1];
    //     for(int i=2; i<n; i++){
    //         dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
    //     }
    //     return Math.min(dp[n-2], dp[n-1]);
    // }
    
    // static int[] dp;
    // static int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     dp = new int[n];
    //     Arrays.fill(dp,-1);
    //     minCost(0,cost);
    //     return Math.min(dp[0], dp[1]);
    // }

    // private static int minCost(int i, int[] cost) {
    //     if(i>=cost.length) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     return dp[i] = cost[i] + Math.min(minCost(i+1,cost),minCost(i+2,cost));
    // }
};