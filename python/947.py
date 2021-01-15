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

#time:68ms;memory:15.2MB
class Solution:
    def removeStones(self, stones: List[List[int]]) -> int:

        self.count = 0
        # 定义并查集
        uf = defaultdict(int)
        # 压缩路径
        def find(x):
            if(uf[x]==0):
                uf[x] = x
                self.count+=1
            if(x!=uf[x]):
                uf[x] = find(uf[x])
            # 返回x的根节点
            return uf[x]
        def union(x,y):
            xroot = find(x)
            yroot = find(y)
            if(xroot == yroot):
                return
            # 合并
            uf[xroot] = yroot
            self.count-=1
        for x,y in stones:
            union(x+20000,y+10000)
        return len(stones) - self.count