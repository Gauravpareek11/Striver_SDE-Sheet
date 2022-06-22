public class Stack_Using_Array {
    int[] arr;
    int j;
    Stack_Using_Array(int n){
        arr=new int[n];
        j=-1;
    }
    void push(int num) {
        // Write your code here.
        if(j==-1){
            j=0;
            arr[j]=num;
        }
        else if(j+1<arr.length) arr[++j]=num;
    }
    int pop() {
        // Write your code here.
        if(j==-1) return -1;
        int a=arr[j];
        arr[j]=0;
        j--;
        return a;
    }
    int top() {
        if(j==-1) return -1;
        return arr[j];
        // Write your code here.
    }
    int isEmpty() {
        if(j==-1) return 1;
        return 0;
        // Write your code here.
    }
    int isFull() {
        if(j==arr.length) return 1;
        return 0;
        // Write your code here.
    } 
}
