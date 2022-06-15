import java.util.*;
public class N_Queens {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int[][] board=new int[n][n];
        solve(0,n,board,ans);
        return ans;
    }
    static void solve(int i,int n,int[][] board,ArrayList<ArrayList<Integer>>ans){
        if(i==n){
            ArrayList<Integer>l1=new ArrayList<>();
            for(int x=0;x<board.length;x++){
                for(int y=0;y<board.length;y++){
                    l1.add(board[x][y]);
                }
            }
            ans.add(l1);
        }
        for(int j=0;j<n;j++){
            if(isValid(i,j,board)){
                board[i][j]=1;
                solve(i+1,n,board,ans);
                board[i][j]=0;
            }
        }
    }
   static boolean isValid(int i,int j,int[][] board){
        for(int k=0;k<i;k++){
            if(board[k][j]==1) return false;
        }
        for(int k=0;k<j;k++){
            if(board[i][k]==1) return false;
        }
        int x=i-1;
        int y=j-1;
        while(x>=0 && y>=0){
            if(board[x][y]==1) return false;
            x--;
            y--;
        }
        x=i-1;
        y=j+1;
        while(x>=0 && y<board.length){
            if(board[x][y]==1) return false;
            x--;
            y++;
        }
        return true;
    }
}
