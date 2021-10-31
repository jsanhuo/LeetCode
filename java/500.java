class Solution {
    public String[] findWords(String[] words) {
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";
        ArrayList<String> r = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            String word = words[i].toLowerCase();
            String keyboard = "";
            if(one.indexOf(word.charAt(0))!=-1){
                keyboard = "qwertyuiop";
            }else if(two.indexOf(word.charAt(0))!=-1){
                keyboard = "asdfghjkl";
            }else if(three.indexOf(word.charAt(0))!=-1){
                keyboard = "zxcvbnm";
            }
            boolean flag = true;
            for(int j = 0;j<words[i].length();j++){
                if(keyboard.indexOf(word.charAt(j))==-1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                r.add(words[i]);
            }
        }
        String[] result = new String[r.size()];
        for(int i=0;i<r.size();i++){
            result[i] = r.get(i);
        }
        return result;
    }
}