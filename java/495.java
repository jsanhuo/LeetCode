class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        int space = 0;
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i+1]-timeSeries[i]>duration){
                result += duration;
            }else{
                result += timeSeries[i+1]-timeSeries[i];
            }
        }

        return result+duration;
    }
}