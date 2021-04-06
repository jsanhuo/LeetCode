//time:1ms;memory:36.8MB
class Solution {
    public int lengthOfLastWord(String s) {
        String[] sl = s.split(" ");
        if(sl.length == 0){
            return 0;
        } 
        return sl[sl.length-1].length();
    }
}