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
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> inorderMap;   // new

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return build(0, 0, inorder.length - 1);
    }

    private TreeNode build(int preStart, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        // root value is at preStart of preorder
        TreeNode root = new TreeNode(preorder[preStart]);
        // O(1) lookup instead of linear scan
        int rootIdx = inorderMap.get(preorder[preStart]);

        // left subtree size = rootIdx - inStart
        // left preorder: from preStart+1, length = size
        root.left = build(preStart + 1, inStart, rootIdx - 1);
        // right preorder: skip left subtree
        root.right = build(preStart + (rootIdx - inStart) + 1, rootIdx + 1, inEnd);
        return root;
    }
}
