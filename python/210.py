#time:52ms;memory:15.6MB
class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        def construct():
            l = [[] for _ in range(numCourses)]
            for c,p in prerequisites:
                l[p].append(c)
            return l
        graph = construct()
        def indegress():
            l = [0 for _ in range(numCourses)]
            for i in range(numCourses):
                for n in graph[i]:
                    l[n]+=1
            return l
        ind = indegress()
        from collections import deque
        queue = deque([i for i in range(numCourses) if ind[i]==0 ])
        result = list(queue)
        while(len(queue)>0):
            current = queue.popleft()
            for i in graph[current]:
                ind[i]-=1
                if(ind[i]==0):
                    result.append(i)
                    queue.append(i)
        if(len(result)!=numCourses):
            return []
        return result

