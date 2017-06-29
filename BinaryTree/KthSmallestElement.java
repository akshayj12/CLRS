/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthsmallest(TreeNode root, int k) {
        if ( root == null)
            return 0;
        int result = 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while( root!=null){
            s.push( root);
            root= root.left;
        }
        int i=0;
        while( !s.isEmpty()){
            TreeNode p = s.pop();
            i++;
            if ( i == k){
                result = p.val;
            }
            
            if ( p.right !=null){
                 p = p.right;
                while( p!=null){
                    s.push(p);
                    p= p.left;
                }
            }
        }
       return result;
    }
}

