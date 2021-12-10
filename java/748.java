class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String result = null;
        int minlength = Integer.MAX_VALUE;
        int[] table1 = new int[26];
        for(int i=0;i<licensePlate.length();i++){
            if(Character.isLetter(licensePlate.charAt(i))){
                table1[Character.toLowerCase(licensePlate.charAt(i))-'a']++;
            }
        }
        for(int i=0;i<words.length;i++){
            int[] table2 = new int[26];
            for(int j=0;j<words[i].length();j++){
                table2[words[i].charAt(j)-'a']++;
            }
            boolean ok = true;
            for(int j=0;j<table1.length;j++){
                if(table2[j]<table1[j]){
                    ok = false;
                    break;
                }
            }
            if(ok&&minlength>words[i].length()){
                minlength = words[i].length();
                result = words[i];
            }
        }
        return result;
    }
}