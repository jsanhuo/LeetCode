class Solution {
    int[] nums = null;
    int[] orgin = null;
    public Solution(int[] nums) {
        this.nums = nums;
        this.orgin = new int[nums.length];
        System.arraycopy(nums, 0, orgin, 0, nums.length);
    }
    
    public int[] reset() {
        System.arraycopy(orgin, 0, nums, 0, nums.length);
        return nums;
    }
    
    public int[] shuffle() {
        int[] result = new int[nums.length];
        int index = 0;
        ArrayList<Integer>temp = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        Random random = new Random();
        for(int i=0;i<nums.length;i++){
            int ri = random.nextInt(temp.size());
            result[index++] = temp.remove(ri);
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */