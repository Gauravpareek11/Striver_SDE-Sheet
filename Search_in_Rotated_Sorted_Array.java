public class Search_in_Rotated_Sorted_Array {
    public static int search(int arr[], int key) {
        // Write your code here.
        int pivot=pivot(arr);
//         System.out.println(pivot);
        int a=find(0,pivot-1,arr,key);
        int b=find(pivot,arr.length-1,arr,key);
        if(a==-1) return b;
        return a;
    }
    static int pivot(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((low==mid||arr[mid-1]>arr[mid]) && (high==mid || arr[mid+1]>arr[mid])) return mid;
            else if(arr[mid]>arr[high]) low=mid+1;
            else high=mid-1;
        }
        return 0;
    }
    static int find(int low,int high,int[] arr,int key){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
