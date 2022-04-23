class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            int left = Math.abs(findleft(arr,i,c)-i);
            int right = Math.abs(findright(arr,i,c)-i);
            result[i] = Math.min(left,right);
        }
        return result;
    }
    public int findleft(char[] arr,int i,char c){
        int result = Integer.MAX_VALUE;
        for(int j=0;j<=i;j++){
            if(arr[j]==c){
                result = j;
            }
        }
        return result;
    }
    public int findright(char[] arr,int i,char c){
        for(int j=i;j<arr.length;j++){
            if(arr[j]==c){
                return j;
            }
        }
        return Integer.MAX_VALUE;
    }

}