class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.empty()&&nums2[i]>=stack.peek()){
                stack.pop();
            }
            map.put(nums2[i],stack.empty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}