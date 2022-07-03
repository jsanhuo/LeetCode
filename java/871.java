class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->b-a);
        int current = startFuel;
        int result = 0;
        boolean[] flag = new boolean[stations.length];
        for(int i=0;i<stations.length;i++){
            if(current>=stations[i][0]&&!flag[i]){
                queue.add(stations[i][1]);
                flag[i] = true;
            }
        }
        while(!queue.isEmpty()){
            if(current>=target){
                break;
            }
            int m = queue.poll();
            current+=m;
            result++;
            for(int i=0;i<stations.length;i++){
            if(current>=stations[i][0]&&!flag[i]){
                queue.add(stations[i][1]);
                flag[i] = true;
            }
        }
        }
        if(current<target){
            return -1;
        }else{
            return result;
        }
    }
}