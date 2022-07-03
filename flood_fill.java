public class flood_fill {

    public static int[][] floodFill(int[][] image, int x, int y, int newColour)
    {
        // Write your code here
        if(image[x][y]==newColour) return image;
        solve(image,x,y,newColour,image[x][y]);
        return image;
    }
    static void solve(int[][] image,int x,int y,int newColour,int prev){
        if(x<0 || x>=image.length || y<0 || y>=image[0].length || image[x][y]!=prev){
         return;   
        }
        else{
            image[x][y]=newColour;
            solve(image,x+1,y,newColour,prev);
            solve(image,x-1,y,newColour,prev);
            solve(image,x,y+1,newColour,prev);
            solve(image,x,y-1,newColour,prev);
        }
    }
}
