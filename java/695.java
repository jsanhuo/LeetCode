class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res= Math.max(res,dfs(grid,i,j));
            }
        }
        return res;
    }
    public int dfs(int[][]grid,int x,int y){
        if(x>=grid.length||x<0||y>=grid[0].length||y<0||grid[x][y]!=1){
            return 0;
        }
        
        int cur = 1;
        grid[x][y] = 0;
        cur += dfs(grid,x+1,y);
        cur += dfs(grid,x-1,y);
        cur += dfs(grid,x,y-1);
        cur += dfs(grid,x,y+1);
        return cur;
    }
}