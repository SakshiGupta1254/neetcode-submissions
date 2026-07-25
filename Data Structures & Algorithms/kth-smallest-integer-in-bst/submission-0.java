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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> r= new ArrayList<Integer>(k);
        if(root != null){
           r = inorder(root,k,r); 
        }
        return r.get(k-1);
    }
    public ArrayList<Integer> inorder(TreeNode n , int k, ArrayList<Integer> r){
            if( n.left != null){
                inorder(n.left,k,r);
              }
              r.add(n.val);
            if(n.right != null){
                inorder(n.right,k,r);
              
            }
            return r;
    }
}
