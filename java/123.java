//time:3ms;memory:54.4MB
class Solution {
    public int maxProfit(int[] prices) {
        int s1 = -1*prices[0];
        int e1 = 0;
        int s2 = -1*prices[0];
        int e2 = 0;
        for(int i =1 ;i<prices.length;i++){
            s1 = s1>-1*prices[i]?s1:-1*prices[i];
            e1 = e1>s1+prices[i]?e1:s1+prices[i];
            s2 = s2>e1-prices[i]?s2:e1-prices[i];
            e2 = e2>s2+prices[i]?e2:s2+prices[i];
        }
        return e2;
    }
}