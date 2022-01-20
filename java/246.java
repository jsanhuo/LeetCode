class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('1','1');
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('8','8');
        if(num.length()==1){
            if(num.charAt(0)=='1'||num.charAt(0)=='0'||num.charAt(0)=='8'){
                return true;
            }else{
                return false;
            }
        }
        for(int i=0;i<(num.length()/2);i++){
            if(map.getOrDefault(num.charAt(i),'a')!=num.charAt(num.length()-1-i)){
                return false;
            }
        }
        if(num.length()%2==1){
            int index= num.length()/2;
            if(num.charAt(index)=='1'||num.charAt(index)=='0'||num.charAt(index)=='8'){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}