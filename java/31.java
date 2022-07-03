class Solution {
    public void nextPermutation(int[] nums) {
        int i = 0,j = 0;
        for(int k = nums.length-2;k>=0;k--){
            if(nums[k+1]>nums[k]){
                i = k;
                j = k+1;
                break;
            }
        }
        int t = 0;
        for(int k=nums.length-1;k>=0;k--){
            if(nums[i]<nums[k]){
                t = k;
                break;
            }
        }
        swap(nums,t,i);
        resever(nums,j,nums.length-1);
    }

    public void resever(int[] nums,int i,int j){
        int ii = i,jj=j;
        while(jj>=ii){
            swap(nums,ii,jj);
            ii++;
            jj--;
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}