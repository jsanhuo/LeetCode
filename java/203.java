/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode pre = head;
        while(pre!=null&&pre.next!=null){
            if(pre.next.val == val){
                pre.next = pre.next.next;
            }else{
                pre = pre.next;
            }
        }


        return head;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next,val);
        // if(head.val == val){
        //     return head.next;
        // }else{
        //     return head;
        // }
        return head.val == val?head.next:head;
    }
}