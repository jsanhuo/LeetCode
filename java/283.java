class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if(nums[right]!=0){
                nums[left++] = nums[right];
            }
            right++;
        }
        for(int i=left;i<nums.length;i++){
            nums[i] = 0;
        }
        
    }
}
