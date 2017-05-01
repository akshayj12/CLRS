/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levelordertraversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left , right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
    
          
}
public class LevelOrderTraversal {
    
    Node root ;
    
    
    public static void leveltraversal(Node root){
        if(root == null)
                return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            System.out.println(node.data);
            if(node.left!= null)
            q.add(node.left);
            if(node.right!= null)
            q.add(node.right);
            
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(20);
        leveltraversal(tree.root);
        
    }
    
}
