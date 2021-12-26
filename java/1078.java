class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList<String>();
        String[] c = text.split(" ");
        for(int i=1;i<c.length-1;i++){
            if(c[i-1].equals(first)&&c[i].equals(second)){
                list.add(c[i+1]);
            }
        }
        String[] result = new String[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}