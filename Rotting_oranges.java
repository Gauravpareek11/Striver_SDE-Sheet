import java.util.*;
class pair{
    int i;
    int j;
    int count;
    pair(int i,int j,int count){
        this.i=i;
        this.j=j;
        this.count=count;
    }
}
public class Rotting_oranges {
    public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
        Queue<pair>q1=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q1.add(new pair(i,j,0));
                }
            }
        }
        int[] row={0,0,-1,1};
        int[] col={-1,1,0,0};
        int ans=0;
        while(!q1.isEmpty()){
            pair p=q1.poll();
            ans=p.count;
            for(int i=0;i<4;i++){
                if(p.i+row[i]<grid.length && p.j+col[i]<grid[0].length && p.i+row[i]>=0 && p.j+col[i]>=0 && grid[p.i+row[i]][p.j+col[i]]==1){
                    grid[p.i+row[i]][p.j+col[i]]=2;
                    q1.add(new pair(p.i+row[i],p.j+col[i],p.count+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans;
	}
}
