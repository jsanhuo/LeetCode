class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=1;i<arr.length;i++){
            int temp = Math.abs(arr[i-1]-arr[i]);
            if(temp<min){
                min = temp;
                result.clear();
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(temp==min){
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return result;
    }
}