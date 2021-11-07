class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor == image[sr][sc]){
            return image;
        }
        return dfs(image,sr,sc,newColor,image[sr][sc]);     
    }
    public int[][] dfs(int[][] image,int x,int y,int newColor,int color){
        int h = image.length;
        int w = image[0].length;
        if(x<0||x>=h||y<0||y>=w){
            return image;
        }
        if(image[x][y] == color){
            image[x][y] = newColor;
            dfs(image,x-1,y,newColor,color);
            dfs(image,x+1,y,newColor,color);
            dfs(image,x,y-1,newColor,color);
            dfs(image,x,y+1,newColor,color);
        }

        return image;
    }
}