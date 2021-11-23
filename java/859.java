class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int temps = 0;
        int tempg = 0;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(temps==0 && (s.charAt(i)!=goal.charAt(i))){
                temps = s.charAt(i);
                tempg = goal.charAt(i);
                count++;
            }else if(temps!=0 &&(s.charAt(i)!=goal.charAt(i))){
                if(s.charAt(i)==tempg && goal.charAt(i)==temps){
                    temps = 0;
                    tempg = 0;
                }else{
                    return false;
                }
                count++;
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>=2&&count==0){
                return true;
            }
        }
        return count==2;
    }
}