class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.clear();
            for(int j = i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                max = Math.max(max,set.size());
            }
        }
        return Math.max(max,set.size());
    }
}