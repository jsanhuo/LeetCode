#time:1672ms;memory:20.8MB
class Solution:
    def hitBricks(self, grid: List[List[int]], hits: List[List[int]]) -> List[int]:
        # 四个方向
        direction=[[0,1],[1,0],[-1,0],[0,-1]]
        # 行数
        rows = len(grid)
        # 列数
        cols = len(grid[0])
        # 没有砖块的位置
        no = []
        # 去除
        i = 0
        copy = [[i  for i in k]for k in grid]
        for i in hits:
            copy[i[0]][i[1]] = 0
        # 总元素数目
        n = rows*cols
        # 初始化并查集
        # 以当前结点为根结点的子树的结点总数
        size = [1 for i in range(n+1)]
        # 当前节点的父节点
        parent = [i for i in range(n+1)]
        # 路径压缩
        def find(x):
            if x!=parent[x]:
                parent[x] = find(parent[x])
            return parent[x]
        # 结合
        def union(x,y):
            rootx = find(x)
            rooty = find(y)
            if(rootx == rooty):
                return
            parent[rootx] = rooty
            size[rooty] += size[rootx]
        # x节点的父亲节点所包含子节点个数
        def getSize(x):
            root = find(x)
            return size[root]
        # 获得位置
        def getIndex(x,y):
            return x*cols + y
        # 判定是否越界
        def isArea(x,y):
            return x>=0 and x<rows and y>=0 and y<cols
        # 将最上面的砖块与屋顶相连
        for j in range(cols):
            if copy[0][j] == 1:
                union(getIndex(0,j),n)

        for i in range(1,rows):
            for j in range(cols):
                if(copy[i][j] == 1):
                    # 向上看
                    if(copy[i-1][j]==1):
                        union(getIndex(i-1,j),getIndex(i,j))
                    # 向左看
                    if(j>0 and copy[i][j-1]==1):
                        union(getIndex(i,j-1),getIndex(i,j))
        
        result = []
        for i in range(len(hits)-1,-1,-1):
            x = hits[i][0]
            y = hits[i][1]
            if grid[x][y] == 0:
                result.insert(0,0)
                continue
            origin = getSize(n)
            if x == 0:
                union(y,n)
            for dir in direction:
                newx = x + dir[0]
                newy = y + dir[1]
                if isArea(newx,newy) and copy[newx][newy] == 1 :
                    union(getIndex(x,y),getIndex(newx,newy))
            current = getSize(n)
            result.insert(0,max(0,current-origin-1))
            copy[x][y] = 1
        return result


