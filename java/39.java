class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        fun(result,list,candidates,target);
        for(int i=0;i<result.size();i++){
            Collections.sort(result.get(i));
        }
        HashSet<List<Integer>> temp = new HashSet<List<Integer>>();
        temp.addAll(result);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        r.addAll(temp);
        return r;
    }
    public void fun(List<List<Integer>> result,LinkedList<Integer> list,int[] candidates,int taget){
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        if(sum==taget){
            result.add((List<Integer>)list.clone());
        }else if(sum<taget){
            for(int i=0;i<candidates.length;i++){
                list.addLast(candidates[i]);
                fun(result,list,candidates,taget);
                list.removeLast();
            }
        }else{
            return;
        }  
    }

}