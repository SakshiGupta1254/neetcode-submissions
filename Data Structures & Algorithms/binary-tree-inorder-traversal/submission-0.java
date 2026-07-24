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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodesleft = new ArrayList<>();
        List<Integer> nodesright = new ArrayList<>();
        List<Integer> nodes = new ArrayList<>();
        if(root != null){
            if(root.left != null){
             nodesleft = inorderTraversal(root.left);
        //     nodesleft.add(root.left.val);
            }
            if(root.right != null){
              nodesright = inorderTraversal(root.right);
         //     nodes.add(root.right.val);
            }
            for(int i : nodesleft){
                nodes.add(i);
            }
            nodes.add(root.val);
            for(int i : nodesright){
                nodes.add(i);
            }
          
        }
        return nodes;
    }
}