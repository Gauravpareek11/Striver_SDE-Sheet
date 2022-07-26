
class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
        String ans ="";
    
    for(int i =0; i<arr[0].length();i++){
        char ch = arr[0].charAt(i);
        
        boolean match = true;
        for(int j = 1; j<n; j++){
            if(arr[j].length() < i || ch != arr[j].charAt(i)){
                match = false;
                break;
            }
        }
        if(match == false){
//             match = true;
            break;
        }
        else{
            ans+=ch;
        }
    }
    return ans;
}
}

