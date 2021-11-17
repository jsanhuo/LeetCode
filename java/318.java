class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i=0;i<words.length;i++){
            int x = words[i].length();
            char[] wi = words[i].toCharArray();
            for(int j=i+1;j<words.length;j++){
                boolean flag = true;
                for(int k=0;k<wi.length;k++){
                    if(words[j].indexOf(wi[k])!=-1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    max = Math.max(max,x*words[j].length());
                }
            }
        }
        return max;
    }
}