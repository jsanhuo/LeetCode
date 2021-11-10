class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            int x = map1.getOrDefault(nums1[i],0);
            int y = map2.getOrDefault(nums1[i],0);
            int count = Math.min(x,y);
            for(int j = 0;j<count;j++){
                list.add(nums1[i]);
            }
            map1.put(nums1[i],0);
            map2.put(nums1[i],0);
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }  
        return result;
        
    }
}