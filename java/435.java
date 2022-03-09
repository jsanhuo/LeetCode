class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==1){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] ints1,int[] ints2){
                return ints1[1]-ints2[1];
            }
        });
        int right = intervals[0][1];
        int result = 1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=right){
                result++;
                right = intervals[i][1];
            }
        }
        return intervals.length-result;
        
    }
}