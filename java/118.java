class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            ArrayList<Integer> templ = new ArrayList<Integer>(i+1);
            for(int j=0;j<i+1;j++){
                if(i==j || j==0){
                    templ.add(1);
                }else{
                    templ.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
            list.add(templ);
        }
        return list;
    }
}