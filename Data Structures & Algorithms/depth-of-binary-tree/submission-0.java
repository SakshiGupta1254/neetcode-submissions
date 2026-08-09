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
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        if(root != null){
        if(root.left != null ){

            left = maxDepth(root.left);
        }
        if(root.right != null){
            right = maxDepth(root.right);
        }
        }
        else{
            return 0;
        }
        return Math.max(1+left,1+right);
    }
}
