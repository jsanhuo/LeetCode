class Solution {
    public boolean isUnique(String astr) {
        int[] map = new int[26];
        for(int i=0;i<astr.length();i++){
            map[astr.charAt(i)-'a'] ++;
            if(map[astr.charAt(i)-'a']>1){
                return false;
            }
        }
        return true;
    }
}