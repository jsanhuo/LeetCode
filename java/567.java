class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int left = 0,right = c1.length-1;
        int [] target = new int[26];
        for(int i=0;i<c1.length;i++){
            target[c1[i]-'a'] ++;
        }
        String t = Arrays.toString(target);
        for(int i=0;i<c2.length-c1.length+1;i++){
            int[] temp = new int[26];
            for(int j = 0;j<c1.length;j++){
                temp[c2[j+i]-'a'] ++;
            }
            if(t.equals(Arrays.toString(temp))){
                return true;
            }
        }
        return false;
    }
}