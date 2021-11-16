class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> colum = new HashSet<Character>();
            for(int j=0;j<board.length;j++){
                if('.'!=board[i][j]&&row.contains(board[i][j])){
                    System.out.println(!".".equals(board[i][j]));
                    System.out.println(board[i][j]);
                    return false;
                }
                if('.'!=board[j][i]&&colum.contains(board[j][i])){
                    System.out.println(!".".equals(board[j][i]));
                    return false;
                }
                if('.'!=board[i][j]){
                    row.add(board[i][j]);
                }
                if('.'!=board[j][i]){
                    colum.add(board[j][i]);
                }
            }
        }
        int r = (board.length/3);
        int tnum =  r* r;
        for(int i=0;i<tnum;i++){
            int x = (i%r) *3;
            int y = (i/r)*3;
            HashSet<Character> square = new HashSet<Character>();
            for(int j = x;j<x+3;j++){
                for(int k = y;k<y+3;k++){
                    if('.'!=board[j][k]&&square.contains(board[j][k])){
                        return false;
                    }else if('.'!=board[j][k]){
                        square.add(board[j][k]);
                    }
                }
            }
        }
        return true;
    }
}