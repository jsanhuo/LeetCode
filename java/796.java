class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char a = sb.charAt(0);
            sb.delete(0,1);
            sb.append(a);
            
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}