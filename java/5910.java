class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        for(int i=0;i<word1.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i=0;i<word2.length();i++){
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        for(int i=0;i<word1.length();i++){
            if(Math.abs(map1.get(word1.charAt(i))-map2.getOrDefault(word1.charAt(i),0))>3){
                return false;
            }
        }
        for(int i=0;i<word2.length();i++){
            if(Math.abs(map2.get(word2.charAt(i))-map1.getOrDefault(word2.charAt(i),0))>3){
                return false;
            }
        }
        return true;
    }
}