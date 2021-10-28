class Solution {
    public boolean reorderedPowerOf2(int n) {
        HashSet<String> set = new HashSet<String>();
        for(int i=1;i<1e9;i<<=1){
            set.add(fun(i));
        }
        return set.contains(fun(n));
    }
    public String fun(int m){
        int[] nums = new int[10];
        while(m>0){
            nums[m%10]++;
            m/=10;
        }
        return Arrays.toString(nums);
    }
}