/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i = 0;i<length;i++){
                Node current = queue.removeFirst();
                if(i<length-1){
                    current.next = queue.getFirst();
                }
                if(current.left!=null){
                    queue.addLast(current.left);
                }
                if(current.right!=null){
                    queue.addLast(current.right);
                }
            }
        }
        return root;
    }
}