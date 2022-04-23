class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<paragraph.length();i++){
            char t = paragraph.charAt(i);
            if(t==','||t==' '||t=='.'||t==';'||t=='?'||t=='!'||t=='\''){
                if(sb.length()>=1){
                    map.put(sb.toString().toLowerCase(),map.getOrDefault(sb.toString().toLowerCase(),0)+1);
                    sb = new StringBuilder();
                }
            }else{
                sb.append(t);
            }
        }
        if(sb.length()>=1){
            map.put(sb.toString().toLowerCase(),map.getOrDefault(sb.toString().toLowerCase(),0)+1);
        }
        String result = "";
        int max = -1;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            boolean flag = true;
            for(int i=0;i<banned.length;i++){
                if(banned[i].equals(e.getKey())){
                    flag = false;
                    break;
                }
            }
            if(flag&&e.getValue()>max){
                result = e.getKey();
                max = e.getValue();
            }
        }
        return result;  
    }
}