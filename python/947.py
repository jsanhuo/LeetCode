#time:88ms;memory:19.2MB
class Solution:
    def removeStones(self, stones: List[List[int]]) -> int:
        dict_X = collections.defaultdict(list)
        dict_Y = collections.defaultdict(list)
        # 定义同行同列的集合
        for x, y in stones:
            dict_X[x].append((x, y))
            dict_Y[y].append((x, y))
        visited = set()
        # 深度优先搜索
        def dfs(node):
            if node in visited:
                return
            visited.add(node)
            x, y = node
            # 扫描行
            for i in dict_X[x]:
                dfs(i)
            # 扫描列
            for i in dict_Y[y]:
                dfs(i)
        
        ans = 0
        for i in stones:
            i = tuple(i)
            if i not in visited:
                ans += 1
                dfs(i)
        
        return len(stones) - ans