/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left+((right-left)>>1);
            if(isBadVersion(mid)){
                right = mid;
            }else if(!isBadVersion(mid)){
                left = mid+1;
            }
        }
        return left;
    }
}