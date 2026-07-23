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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root != null){
            if(key > root.val){
                root.right = deleteNode(root.right,key);
            }
            else if(key < root.val){
                root.left = deleteNode(root.left,key);
            }
            else if(key == root.val){
                if(root.left ==null && root.right == null){
                    root = null;
                }
                else if(root.left != null && root.right == null){
                    root = root.left;
                }
                else if(root.left ==null && root.right != null){
                        root = root.right;
                }
                else if(root.left != null && root.right != null){
                    TreeNode leftchild = root.left;
                    TreeNode temp = largestLeftSide(root.left);
                    root.val = temp.val;
                    root.left = deleteNode(root.left,temp.val);
                }

            }
        }
        return root;
    }
    public TreeNode largestLeftSide(TreeNode root){
        if(root.right != null){
            root = largestLeftSide(root.right);
        }
        return root;
    }
}