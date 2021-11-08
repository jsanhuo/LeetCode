class Solution {
    public String getHint(String secret, String guess) {
        
        int[] sec = new int[10];
        int[] gue = new int[10];

        int bulls = 0;
        for(int i =0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            sec[secret.charAt(i)-'0'] ++;
            gue[guess.charAt(i)-'0'] ++;
        }
        int cows = 0;
        for(int i=0;i<10;i++){
            cows += Math.min(sec[i],gue[i]);
        }
        return bulls+"A"+(cows-bulls)+"B";
        
    }
}