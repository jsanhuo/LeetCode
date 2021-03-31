//time:9ms;memory:38.1MB
class Solution {
    public int searchInsert(int[] nums, int target) {
        int befor = 0;
        int after = nums.length;
        int mid = 0;
        while(befor!=after){
            mid = (after+befor)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                after = mid;
            }else if(nums[mid]<target){
                befor = mid+1;
            }
        }
        return befor;
    }
}