#time:40ms;memory:15MB
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        my_dict={}
        # 层次遍历
        level=0
        l_queue=[]
        queue=[]
        p=root
        queue.append(p)
        l_queue.append(level)
        while len(queue)!=0:
            p=queue.pop(0)
            level=l_queue.pop(0)
            if level%2==0:
                my_dict.setdefault(level,[])
                my_dict[level].append(p.val)
            else:
                my_dict.setdefault(level,[])
                my_dict[level].insert(0,p.val)
            if p.left:
                queue.append(p.left)
                l_queue.append(level+1)
            if p.right:
                queue.append(p.right)
                l_queue.append(level+1)
        return list(my_dict.values())