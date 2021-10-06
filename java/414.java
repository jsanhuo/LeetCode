//time:4ms;memory:37.9MB
class Solution {
    public int thirdMax(int[] nums) {
        int length = nums.length;
        TreeSet<Integer> min = new TreeSet<Integer>(); 
        for(int i=0;i<length;i++){
            min.add(nums[i]);
            if(min.size()>3){
                min.remove(min.first());
            }
        }
        return min.size()==3?min.first():min.last();
    }
}