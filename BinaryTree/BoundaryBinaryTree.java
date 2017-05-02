package boundarybinarytree;

/**
 *
 * @author AkshayJain
 */
class Node{
    Node left, right;
    int data;
    Node( int data){
        this.data = data;}
}
public class BoundaryBinaryTree {
    Node root;
    public void printleaves(Node node){
        if( node != null){
        printleaves(node.left);
        if( node.left == null && node.right == null){
            System.out.print(node.data);
        }
        printleaves(node.right);
        }
    }
    
    public void printboundaryleft(Node node){
        if( node != null){
            if( node.left!= null){
                System.out.print(node.data);
                printboundaryleft(node.left);
            }
            else if ( node.right != null){
                System.out.print(node.data);
                printboundaryleft(node.right);
    
            }
        }
    }
    public void printboundaryright( Node node ){
        if( node!= null){
            if( node.right != null){
                printboundaryright( node.right);
                System.out.print(node.data);
            }
            else if ( node.left!=null)
            {
                printboundaryright(node.left);
                System.out.print(node.data);
            }
        }
        
    }
    void printBoundary(Node node) 
    {
        if (node != null) 
        {
            System.out.print(node.data + " ");
  
            // Print the left boundary in top-down manner.
            printboundaryleft(node.left);
  
            // Print all leaf nodes
            printleaves(node.left);
            printleaves(node.right);
  
            // Print the right boundary in bottom-up manner
            printboundaryright(node.right);
        }
    }

    public static void main(String[] args) {
        BoundaryBinaryTree tree = new BoundaryBinaryTree();
         tree.root = new Node(20);
         tree.root.left = new Node (8);
          tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);
    }
    
}
