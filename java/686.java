class Solution {
    public int repeatedStringMatch(String a, String b) {
        if("".equals(b)){
            return 0;
        }
        int index = a.indexOf(b.charAt(0));
        if(index==-1){
            return -1;
        }
        int lengtha = a.length();
        int count = 0;
        int j=-1;
        while(true){
            index = a.indexOf(b.charAt(0),j+1);
            if(index==-1){
                break;
            }
            boolean flag = true;
            int temp = index;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)!=a.charAt(temp%lengtha)){
                    flag = false;
                    break;
                }
                temp++;
            }
            if(flag){
                count = temp;
                break;
            }
            j=index;
        }
        if(count == 0){
            return -1;
        }
        return (int)Math.ceil(count/(float)lengtha);
    }
}