/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbst;

/**
 *
 * @author AkshayJain
 */
class Node{
    int data;
    Node left , right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class IsBST {
    Node root;
    
    public boolean isbst(Node root){
        if(root == null)
            return true;
        return isbstutil( root, Integer.MIN_VALUE ,Integer.MAX_VALUE );
        
    }
    public boolean isbstutil( Node root, Integer min, Integer max){
        if ( root == null)
               return true;
        
        if(root.data < min || root.data> max )
            return false;
        System.out.print(isbstutil(root.left, min , root.data));
        return (isbstutil(root.left, min , root.data) || isbstutil(root.right, root.data,max));
            
        
        //return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         IsBST tree = new IsBST();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(11);
        System.out.print(tree.isbst(tree.root));
    }
    
}
