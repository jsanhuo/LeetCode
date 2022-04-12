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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        return (Math.abs(left-right)<=1)&&(isBalanced(root.left)&&isBalanced(root.right));
    }

    public int deep(TreeNode root){
        if(root==null){
            return -1;
        }
        int left=0,right = 0;
        if(root.right!=null){
            right = deep(root.right)+1;
        }
        if(root.left!=null){
            left = deep(root.left)+1;
        }
        return Math.max(left,right);
    }   
    
}