class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] result = new int[map.size()];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                result[index++] = entry.getKey();
            }
        }
        int[] r = new int[index];
        System.arraycopy(result,0,r,0,index);
        return r;
    }
}