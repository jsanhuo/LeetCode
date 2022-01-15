class Solution {
    public int totalMoney(int n) {
        int w = n/7;
        int sum = 0;
        for(int i=1;i<=w;i++){
            sum+=7*(i+i+6)/2;
        }
        //10-7  3 *(2+5)
        sum+=(n-w*7)*(w+1+w+(n-w*7))/2;
        return sum;
    }
}