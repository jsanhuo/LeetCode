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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int current = head.val;
        head = head.next;
        int index = 1;
        while(head.next!=null){
            if(head.val>current && head.val>head.next.val){
                list.add(index);    
            }else if(head.val<current && head.val<head.next.val){
                list.add(index);
            }
            index++;
            current = head.val;
            head = head.next;
        }
        
        if(list.size()==2){
            result[0] = list.get(1)-list.get(0);
            result[1] = result[0];
        }else if(list.size()>2){
            int min = 10000000;
            int max = -1;
            for(int i=0;i<list.size()-1;i++){
                int temp = list.get(i+1)-list.get(i);
                if(temp<min){
                    min = temp;
                }
            }
            result[0] = min;
            result[1] = list.get(list.size()-1)-list.get(0);
        }
        return result;
    }
}