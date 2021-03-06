public class Solution {
    class Node{
        String word;
        int length;
        Node( String word, int length){
            this.word = word;
            this.length = length;
        }
    }
    public int ladderLength(String start, String end, ArrayList<String> dictV) {
        Queue<Node> q= new LinkedList<Node>();
        q.offer(new Node(start, 1));
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            if ( temp.word.equals(end)){
                       return temp.length;
                   }
            
           for ( int i=0;i<dictV.size();i++){
               if(compare(dictV.get(i),temp.word)){
                   q.offer(new Node(dictV.get(i), temp.length+1));
                   dictV.remove(i);
                
               }
           }
        }
        return 0;
    }
    
    public boolean compare(String word1 , String word2){
        int count =0;
        for ( int i=0 ; i< word1.length();i++){
            if ( word1.charAt(i) != word2.charAt(i)){
                count ++;
            }
                
        }
        if ( count !=1)
            return false;
       else
            return true;
    }
}

