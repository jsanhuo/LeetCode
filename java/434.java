//time:8ms;memory:36.1MB
class Solution {
    public int countSegments(String s) {
        String[] r = s.split(" ");
        int result = 0;
        for(int i=0;i<r.length;i++){
            if(!"".equals(r[i])){
                result++;
            }
        }
        return result;
    }
}