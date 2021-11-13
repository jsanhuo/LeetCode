class Solution {
    public boolean detectCapitalUse(String word) {
        String upword = word.toUpperCase();
        String loword = word.toLowerCase();
        if(word.equals(upword)||word.equals(loword)){
            return true;
        }
        for(int i =1;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                return false;
            }
        }
        return true;
    }
}