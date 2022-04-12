class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = 1;
        for(int i=0;i<s.length();i++){
            int j =s.charAt(i)-'a';
            if(result[1]+widths[j]>100){
                result[0]++;
                result[1]=widths[j];
            }else{
                result[1]+=widths[j];
            }
            
        }
        return result;
    }
}