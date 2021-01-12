#time:40ms;memory:15.6MB
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # 构造邻接表
        graph = self.construct(numCourses, prerequisites)
        # 计算入度
        indegrees = self.getIndegrees(graph)
        # 初始化队列（将入度为0的节点入队）
        from collections import deque
        queue = deque([node for node in range(numCourses) if indegrees[node] == 0 ])
        if len(queue) == 0: return False
        # BFS
        result = list(queue)
        while len(queue) > 0:
            # 取出第一个元素
            node = queue.popleft()
            # 查看以此节点的后续节点
            for nb in graph[node]:
                indegrees[nb] -= 1
                if indegrees[nb] == 0:
                    result.append(nb)
                    queue.append(nb)
        # 如果所有节点都被遍历，那么说明可以走通
        return len(result) == numCourses

    def construct(self, N, prerequisites):
        # 根据有向边集合构建图
        graph = [[] for i in range(N)]
        for u, v in prerequisites:
            graph[v].append(u)
        return graph

    def getIndegrees(self,graph):
        l = [0 for _ in range(len(graph))]
        for i in range(len(graph)):
            for j in graph[i]:
                l[j] +=1
        return l