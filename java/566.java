class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        int[][] news = new int[r][c];
        int oindex = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                news[i][j] = mat[oindex/mat[0].length][oindex%mat[0].length];
                oindex++;
            }
        }
        return news;
    }
}