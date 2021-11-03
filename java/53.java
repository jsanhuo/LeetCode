//DP
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int result = nums[0];
        for (int x : nums) {
            pre = Math.max(pre+x, x);
            result = Math.max(result,pre);
        }
        return result;
    }
}
//Ì°ÐÄ
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        for (int i=1;i<nums.length;i++) {
            current = Math.max(nums[i],current+nums[i]);
            max = Math.max(current,max);
            
        }
        return max;
    }
}