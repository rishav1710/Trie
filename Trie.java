//INSERT AND SEARCH


class Trie{
    final static int ALPH_SIZE=26;
   
    class TrieNode{
        TrieNode[] children=new TrieNode[ALPH_SIZE];
        boolean isEndOfWord;
        TrieNode(){
            
            for(int i=0;i<ALPH_SIZE;i++)
            children[i]=null;
            
            isEndOfWord=false;
        }
    }
     TrieNode root;
     Trie(){
         root=new TrieNode();
     }
    void insert(String key){
        
        TrieNode temp=root;
        int index;
        for(int i=0;i<key.length();i++){
            index=key.charAt(i)-'a';
            if(temp.children[index]==null)
            temp.children[index]=new TrieNode();
            
            temp=temp.children[index];
        }
        temp.isEndOfWord=true;
    }
    
    boolean search(String key){
        TrieNode temp=root;
        int index;
        for(int i=0;i<key.length();i++){
            index=key.charAt(i)-'a';
            if(temp.children[index]==null)
            return false;
            
            temp=temp.children[index];
        }
        return temp.isEndOfWord;
    }
    
}
