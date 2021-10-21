class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int[] b = new int[digits.length+1]; 
        for(int i=digits.length-1;i>=0;i--){
            if(c==1&&digits[i]==9){
                b[i+1] = 0;
                c = 1;
            }else if(c==1){
                b[i+1] = digits[i] +1;
                c = 0;
            }else{
                b[i+1] = digits[i];
            }
        }
        if(c==1){
            b[0] = 1;
        }
        
        if(b[0]==0){
            System.arraycopy(b,1,digits,0,digits.length);
            return digits;
        }else{
            return b;
        }
    }
}