/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
public class The_Celebrity_Problem {
    public static int findCelebrity(int n) {
        // Write your code here.
        int[] in=new int[n];
        int[] out=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Runner.knows(i,j)){
                    out[i]++;
                    in[j]++;
                }
                if(Runner.knows(j,i)){
                    out[j]++;
                    in[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(out[i]==0 && in[i]==n-1) return i;
        }
        return -1;
    }
}
