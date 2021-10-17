//time:0ms;memory:38.1MB
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
    int count = 0;
    int result = -1;
    public void dfs(TreeNode root, int k){
        if(root == null || result!=-1){
            return;
        }
        dfs(root.left,k);
        count++;
        if(count == k){
            result = root.val;
        }
        dfs(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return result;
    }
}