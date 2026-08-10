/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int m =0;
    public int diameterOfBinaryTree(TreeNode root) {
        hlpr(root);
       return m;
    }
    public int hlpr( TreeNode root){
        int l =0;
        int r = 0;
        
        if( root != null){
            if(root.left != null){
            l = hlpr(root.left);
            }
            if(root.right != null){
            r = hlpr(root.right);
            }
        }
        else{
            return 0;
        }
        m = Math.max(m, l+r);
        return 1+ Math.max(l,r);
    }
}
