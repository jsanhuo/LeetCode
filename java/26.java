//time:1ms;memory:40.01MB
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index = 0;
    	for(int i=0;i<nums.length;i++) {
    		if(i==0) {
    			nums[index] = nums[0];
    			continue;
    		}
    		if(nums[i]==nums[index]) {
    			continue;
    		}else {
    			nums[++index] =nums[i];
    		}
    	}
        return index+1;
    }
}