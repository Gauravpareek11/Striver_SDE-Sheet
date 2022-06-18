import java.util.*;
public class Rat_in_a_Maze_all_Paths {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        int[][] ans=new int[n][n];
        boolean[][] vis=new boolean[n][n];
        ArrayList<ArrayList<Integer>>a1=new ArrayList<>();
        solve(maze,n-1,n-1,ans,a1,vis);
        return a1;
        // Write your code here.
    }
    static void solve(int[][] maze,int i,int j,int[][] ans, ArrayList<ArrayList<Integer>>a1,boolean[][] vis){
        if(i<0 || j<0 || i>=maze.length || j>=maze.length|| maze[i][j]==0||vis[i][j]) return;
        if(i==0 && j==0){
            ArrayList<Integer>l1=new ArrayList<Integer>();
            ans[i][j]=1;
            for(int x=0;x<maze.length;x++){
                for(int y=0;y<maze.length;y++){
                    l1.add(ans[x][y]);
                }
            }
            a1.add(l1);
            return;
        }
        ans[i][j]=1;
        vis[i][j]=true;
        solve(maze,i,j-1,ans,a1,vis);
        solve(maze,i,j+1,ans,a1,vis);
        solve(maze,i-1,j,ans,a1,vis);
        solve(maze,i+1,j,ans,a1,vis);
        ans[i][j]=0;
        vis[i][j]=false;
    }
}
