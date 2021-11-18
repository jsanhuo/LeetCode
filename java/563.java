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
    int result = 0;
    public int findTilt(TreeNode root) {    
        fun(root);
        return result;
    }
    public int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = fun(root.left);
        int r = fun(root.right);
        result += Math.abs(l-r);
        return l+r+root.val;
        
    }
}