class Solution {
    public int[] analysisHistogram(int[] heights, int cnt) {
        Arrays.sort(heights);
        int[] result = new int[cnt];
        int index = 0;
        int min = 100000000;
        for(int i=0;i<heights.length-cnt+1;i++){
            if(heights[i+cnt-1]-heights[i]<min){
                index = i;
                min = heights[i+cnt-1]-heights[i];
            }
        }
        for(int i=0;i<cnt;i++){
            result[i] = heights[i+index];
        }
        return result;
    }
}