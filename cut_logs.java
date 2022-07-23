class Solution {
    public static int dp[][];
    public static int cutLogs(int k, int n) {
        //Write your code here
        dp=new int[101][10001];
        for(int i=0;i<=100;i++)
        {
            for(int j=0;j<=10000;j++)
            {
                dp[i][j]=-1;
            }
        }
        return cut(k,n);
    }
    public static int cut(int k,int n)
    {
        if(n==0 || n==1)
            return n;
        if(k==1)
            return n;
        if(dp[k][n]!=-1)
            return dp[k][n];
        int ans=Integer.MAX_VALUE;
        int l=1,h=n;
        
        while(l<=h)
        {
            int i=l+(h-l)/2;
            int a1=cut(k-1,i-1);
            int a2=cut(k,n-i);
            int temp=1+Math.max(a1,a2);
            
            if(a1<=a2)
                l=i+1;
            else
                h=i-1;
            ans=Math.min(ans,temp);
        }
        return dp[k][n]=ans;
    }

}

