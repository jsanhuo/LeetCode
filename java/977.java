class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length-1;
        for(int i=0,j = nums.length-1;i<=j;){
            int t = 0;
            int ii = (int)Math.pow(nums[i],2);
            int jj = (int)Math.pow(nums[j],2);
            if(ii>jj){
                t = ii;
                i ++ ;
            }else{
                t = jj;
                j --;
            }
            result[index--] = t;
        }
        return result;
    }
}