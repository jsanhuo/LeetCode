class Solution {
    public int nextGreaterElement(int n) {
        int result = 0;
        String a = Integer.toString(n);
        char[] ints = a.toCharArray();
        int k=0,j=0;
        for(int i=ints.length-2;i>=0;i--){
            if(ints[i+1]>ints[i]){
                j = i+1;
                k = i;
                break; 
            }
        }
        int t = 0;
        for(int i = ints.length-1;i>=0;i--){
            if(ints[k]<ints[i]){
                t = i;
                break;
            }
        }
        char temp = ints[t];
        ints[t] = ints[k];
        ints[k] = temp;
        int ii = j,jj=ints.length-1;
        while(ii<=jj){
            temp = ints[ii];
            ints[ii] = ints[jj];
            ints[jj] = temp;
            ii++;
            jj--;
        }
        for(int i=0;i<ints.length;i++){
            result = result*10+(ints[i]-'0');
        }
        if(result<=n){
            return -1;
        }
        return result>Integer.MAX_VALUE?-1:result;

    }
}