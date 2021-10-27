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