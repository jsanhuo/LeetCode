class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                if(i == j+1){
                    dp[i][j] = i;
                }else{
                    int minCost = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int cost = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                        minCost = Math.min(minCost, cost);
                    }
                    dp[i][j] = minCost;
                } 
            }
        }
        return dp[1][n];
    }
}