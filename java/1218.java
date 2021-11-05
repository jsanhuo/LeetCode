class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int ans = 0;
        Map<Integer, Integer> dp = new HashMap<Integer, Integer>();
        for (int v : arr) {
            //获取以v-d结尾的子序列长度
            dp.put(v, dp.getOrDefault(v - difference, 0) + 1);
            //以当前数字v结尾的子序列长度和最长长度进行对比
            ans = Math.max(ans, dp.get(v));
        }
        return ans;
    }
}