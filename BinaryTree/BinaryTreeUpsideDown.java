
package binarytreeupsidedown;

/**
 *
 * @author AkshayJain
 */
public class BinaryTreeUpsideDown {
    class Node {
        int data;
        Node left , right;
        Node ( int data){
            this.data = data;
            left = right = null;
        }
    }
    public Node upsideDown( Node root){
        if ( root == null)
                return null;
        Node parent = null;
        Node parentRightChild = null;
        Node p = root;
        while ( p!= null){
            Node temp = p.left;
            p.left  = parentRightChild;
            parentRightChild = p.right;
            
            p.right = parent;
            parent = p;
            p = temp;
        }
        return parent;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

