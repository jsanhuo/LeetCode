class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        while(i>=0||j>=0){
            int current = 0;
            if(j>=0&&i>=0){
                current = (int)(a.charAt(i)-'0')+(int)(b.charAt(j)-'0')+c;
                j--;
                i--;
            }else if(j>=0){
                current = (int)(b.charAt(j)-'0')+c;
                j--;
            }else{
                current = (int)(a.charAt(i)-'0')+c;
                i--;
            }
            c = current/2;
            current = current%2;
            sb.append(current);
        }
        if(c==1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}