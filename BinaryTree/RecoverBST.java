public class RecoverBST {

    /**
     * @param args the command line arguments
     */

    recoverBST(Node root){
    if ( root == null)
        return null;
    
    Node prev = null;
    Node first = null;
    Node last = null;
    recoverBST( root.left);
    if ( prev!= null){
         if ( prev.data > root.data){
                if ( first == null )
                    first = prev;
                last = root;
                    }       
        } 
    prev = root;   
    recoverBST(root.right);
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
