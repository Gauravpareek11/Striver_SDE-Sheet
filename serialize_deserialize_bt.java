/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/


class Solution 
{
    static TreeNode<Integer> temp;
    public static String serializeTree(TreeNode<Integer> root)
    {
        //    Write your code here for serialization of the tree.
        temp=root;
        String str="";
        return str;
    }
    
    public static TreeNode<Integer> deserializeTree(String str)
    {
        //    Write your code here for deserialization of the tree.
        return temp;
    }
}

