class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1;
        int k = n-1;
        for(int i=nums1.length-1;i>=0;i--){
            if(j>=0&&k>=0&&nums1[j]>nums2[k]){
                nums1[i] = nums1[j--];
            }else if(j>=0&&k>=0&&nums1[j]<nums2[k]){
                nums1[i] = nums2[k--];
            }else if(j>=0){
                nums1[i] = nums1[j--];
            }else if(k>=0){
                nums1[i] = nums2[k--];
            }
        }
    }
}