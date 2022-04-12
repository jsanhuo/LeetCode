class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        TreeSet<String> list = new TreeSet<String>();
        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");
        HashMap<String,Integer> map1 = new  HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new  HashMap<String,Integer>();
        for(int i=0;i<ss1.length;i++){
            map1.put(ss1[i],map1.getOrDefault(ss1[i],0)+1);
        }
        for(int i=0;i<ss2.length;i++){
            map2.put(ss2[i],map2.getOrDefault(ss2[i],0)+1);
        }
        for(int i=0;i<ss1.length;i++){
            if(map1.get(ss1[i])==1&&map2.getOrDefault(ss1[i],0)==0){
                list.add(ss1[i]);
            }
        }
        for(int i=0;i<ss2.length;i++){
            if(map2.get(ss2[i])==1&&map1.getOrDefault(ss2[i],0)==0){
                list.add(ss2[i]);
            }
        }
        int len = list.size();
        String[] re = new String[len];
        for(int i=0;i<len;i++){
            re[i] = list.pollFirst();
        }
        return re;
    }
}