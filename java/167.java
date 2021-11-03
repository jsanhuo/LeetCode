class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        while(l<r){
            int temp = numbers[l]+numbers[r];
            if(target == temp){
                return new int[]{l+1,r+1};
            }else if(target>temp){
                l++;
            }else{
                r--;
            }
        }
        return null;
    }
}