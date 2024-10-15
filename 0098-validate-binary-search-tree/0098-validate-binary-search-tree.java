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
    public boolean isValidBST(TreeNode root) {
         return isValidBinarySearchTree(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidBinarySearchTree(TreeNode root,long range1,long range2)
    {
        
        if(root==null)
        return true;
        
        if(!(root.val>range1 && root.val<range2))
        return false;
        
        return isValidBinarySearchTree(root.left,range1,root.val) && 
        isValidBinarySearchTree(root.right,root.val,range2);

    }
}