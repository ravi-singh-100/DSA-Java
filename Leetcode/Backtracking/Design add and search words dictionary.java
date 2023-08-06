// Ques:https://leetcode.com/problems/design-add-and-search-words-data-structure/

class WordDictionary {
private class Node{
    char ch;
    HashMap<Character,Node>children=new HashMap<>();
    boolean isTerminal=false;
}
private Node root;
    public WordDictionary() {
       Node nn=new Node();
       nn.ch='*';
       root=nn; 
    }
    
    public void addWord(String word) {
        Node temp=root;
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(temp.children.containsKey(ch)){
                temp=temp.children.get(ch);
            }
            else{
                Node nn=new Node();
                nn.ch=ch;
                temp.children.put(ch,nn);
                temp=nn;
              
            }
        }
        temp.isTerminal=true;
    }
    
    public boolean search(String word) {
        Node temp=root;
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(ch=='.') {
           boolean opt=false;
                for(char c:temp.children.keySet()){
opt =opt|| helper(temp.children.get(c),word,i+1,n);
                }
                return opt;
            }
         
           else if(!temp.children.containsKey(ch)) return false;
           else
            temp=temp.children.get(ch);
        }
        return temp.isTerminal;
    }
    public boolean helper(Node temp,String word,int i,int n){
 for(int j=i;j<n;j++){
            char ch=word.charAt(j);
            if(ch=='.') {
           boolean opt=false;
                for(char c:temp.children.keySet()){
opt =opt|| helper(temp.children.get(c),word,j+1,n);
                }
                return opt;
            }

           else if(!temp.children.containsKey(ch)) return false;
           else
            temp=temp.children.get(ch);
        }
        return temp.isTerminal;
    }
  
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
