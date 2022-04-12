class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result =0 ;
        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i))){
                result++;
            }
        }
        return result;
    }
    public boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}