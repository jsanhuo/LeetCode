//time:0ms;memory:35.4MB
class Solution {
    public int findComplement(int num) {
        int[] a = new int[(int)(Math.log(num)/Math.log(2))+1];
        int i = 0;
        while(num!=0){
            a[i++] = num%2;
            num = num/2;
        }
        int result = 0;
        for(int j=0;j<a.length;j++){
            int k = a[j]==0?1:0;
            result += k*Math.pow(2,j);
        }
        return result;
    }
}