class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList list = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;   
    }

}