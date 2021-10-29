class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()+needle.length()==0||needle.length()==0){
            return 0;
        }
        int result = -1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.length()-i>=needle.length()&&haystack.charAt(i)==needle.charAt(0)){
                boolean f = true;
                for(int j=0;j<needle.length();j++){
                    if(needle.charAt(j)!=haystack.charAt(j+i)){
                        f = false;
                        break;
                    }
                }
                if(f){
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}