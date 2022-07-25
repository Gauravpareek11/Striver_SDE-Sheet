class Node{
    Node[] link=new Node[26];
    boolean flag=false;
    int cw=0;
    int cp=0;
    
    boolean containsKey(char x){
        return (link[x-'a']!=null);
    }
    Node get(char x){
        return link[x-'a'];
    }
    void put(char x,Node temp)
    {
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
    Node root;
    public Trie() {
        // Write your code here.
        root=new Node();
    }

    public void insert(String word) {
        // Write your code here.
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
            node.cp++;
        }
        node.setEnd();
        node.cw++;
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))) return 0;
            node=node.get(word.charAt(i));
        }
        if(node.isEnd()){
            return node.cw;
        }
        return 0;
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))) return 0;
            node=node.get(word.charAt(i));
        }
        return node.cp;
    }

    public void erase(String word) {
         Node node=root;
        for(int i=0;i<word.length();i++){
            node=node.get(word.charAt(i));
            node.cp--;
        }
        node.cw--;
        // Write your code here.
    }

}

