class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String result = "";
        int ii = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                ii++;
                if(ii==k){
                    result += arr[i];
                    break;
                }
            }
        }
        return result;
    }
}