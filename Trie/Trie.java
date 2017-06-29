
public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode prevNode= root;
        for ( int i =0;i<word.length();i++){
            char c = word.charAt(i);
            
            if ( prevNode.children.containsKey(c)){
                prevNode = prevNode.children.get(c);
            }
            else{
                TrieNode curr = new TrieNode(c);
                prevNode.children.put( c, curr);
                prevNode = curr;
            }
            
            if ( i == word.length() -1){
                prevNode.isLeaf= true;   
            }
        }
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode t = searchNode(word);
        
        if ( t!=null && t.isLeaf)
            return true;
        else
            return false;
    }
    public TrieNode searchNode ( String word){
        TrieNode prev  = root;
        for ( int i =0;i<word.length();i++){
            char c = word.charAt(i);
            if ( prev.children.containsKey(c)){
                prev = prev.children.get(c);
                }
            else
            {        System.out.println( c);

                return null;}
            
        }
        return prev;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (searchNode(prefix) == null )
            return false;
        else
            return true;
        
    }
}
 class TrieNode{
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf ;
    TrieNode(){}
    TrieNode(char c){
    this.c = c;        
    }
}

