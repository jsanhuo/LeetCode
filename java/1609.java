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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int layer = 0;
        while(!q.isEmpty()){
            int len = q.size();
            int current = -1;
            for(int i=0;i<len;i++){
                TreeNode c = q.poll(); 
                if(layer%2==0){
                    if(c.val%2!=0){
                        if(current==-1){
                            current = c.val;
                        }else{
                            if(current>=c.val){
                                return false;
                            }else{
                                current = c.val;
                            }
                        }
                    }else{
                        return false;
                    }
                }else if(layer%2==1){
                    if(c.val%2!=1){
                        if(current==-1){
                            current = c.val;
                        }else{
                            if(current<=c.val){
                                return false;
                            }else{
                                current = c.val;
                            }
                        }                        
                    }else{
                        return false;
                    }
                } 
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            layer++;
        }



        return true;
    }

}