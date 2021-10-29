/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteListNode(ListNode head) {
        ListNode current = head;
        int i = 0;
        while(current!=null){
            if(current.next!=null){
                current.next = current.next.next; 
            }
            current = current.next; 
        }
        return head;
    }
}