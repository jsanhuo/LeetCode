class Solution {
    public String reverseWords(String s) {
        String[] sp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sp.length;i++){
            sb.append(r(sp[i]));
            if(i!=sp.length-1){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public String r(String s){
        char[] cs = s.toCharArray();
        int left = 0,right = cs.length-1;
        while(left<right){
            char c = cs[left];
            cs[left] = cs[right];
            cs[right] = c;
            left++;
            right--;
        }
        return new String(cs);
    }
}