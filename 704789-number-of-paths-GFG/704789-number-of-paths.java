class Solution {
public int numberOfPaths(int m, int n){
    if(m == 1 || n == 1) return 1;

    int[][] dp = new int[2][n];

    for(int j = 0; j < n; j++) dp[0][j] = 1;

    for(int i = 1; i < m; i++){
        dp[1][0] = 1;
        for(int j = 1; j < n; j++){
            dp[1][j] = dp[0][j] + dp[1][j-1];
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = dp[1][j];
        }
    }

    return dp[0][n-1];
}
    
    // public int numberOfPaths(int m, int n){
    //     int[][] dp = new int[m][n];
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==0 || j==0) dp[i][j] = 1;
    //             else dp[i][j] = dp[i-1][j] + dp[i][j-1];
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }
}