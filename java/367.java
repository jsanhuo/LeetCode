class Solution {
    public boolean isPerfectSquare(int num) {
        double x0 = 1,x1 = 0;
        while(true){
            x1 = (x0*x0+num)/(2*x0);
            if((x0-x1)*(x0-x1) < 1e-8){
                break;
            }
            x0 = x1;
        }
        int x = (int) x0;
        return x*x == num;
    }
}