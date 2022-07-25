class Node{
    Node link[]=new Node[26];
    boolean flag=false;
    
    boolean containsKey(char x){
        return link[x-'a']!=null;
    }
    Node get(char x){
        return link[x-'a'];
    }
    void put(char x,Node temp){
        link[x-'a']=temp;
    }
    boolean isEnd(){
        return flag;
    }
    void setEnd(){
        flag=true;
    }
}
class Trie {

    static Node root;
    //Initialize your data structure here

    Trie() {
        root=new Node();
        //Write your code here
    }


    //Inserts a word into the trie

    public static void insert(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
        //Write your code here
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))) return false;
            node=node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
        Node node=root;
        for(int i=0;i<prefix.length();i++){
            if(!node.containsKey(prefix.charAt(i))) return false;
            node=node.get(prefix.charAt(i));
        }
        return true;
    }
}
