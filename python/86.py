# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#time:44ms;memory:14.9MB
class Solution:
    def partition(self, head: ListNode, x: int) -> ListNode:
        #大于X的链表，小于X的链表
        big, small = ListNode(0), ListNode(0)
        rec, reg = big, small
        p = head
        while p:
            if p.val >= x:
                rec.next = ListNode(p.val)
                rec = rec.next
            else:
                reg.next = ListNode(p.val)
                reg = reg.next
            p = p.next
        #将大的连接到小的后面
        reg.next = big.next
        return small.next
