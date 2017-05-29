/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    class Node{
        TreeNode node;
        int depth;
        Node( TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
            
        }
    }
    public int minDepth(TreeNode root) {
        if ( root == null)
            return 0;
        Queue<Node> q = new LinkedList<Node>();
        Node node = new Node( root, 1);
        q.add( node);
        while( !q.isEmpty()){
            Node temp = q.poll();
            TreeNode n = temp.node;
            int depth = temp.depth;
            
            if ( n.left == null && n.right == null)
                return depth;
            
            if ( n.left != null)
                {
                    q.add( new Node( n.left, depth+1));
                }
            if ( n.right != null)
                {
                    q.add( new Node ( n.right , depth+1));
                }
        }
        return 0;
        
        
    }
}
