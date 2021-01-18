# time:244ms;memory:18.7MB
# 并查集
class UF:
    def __init__(self,n):
        self.parent = list(range(n))
    def find(self,x):
        if(self.parent[x] != x):
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
    def union(self,x,y):
        rootx = self.find(x)
        rooty = self.find(y)
        if(rootx == rooty):
            return;
        self.parent[rooty] = rootx
class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        # 1.先找出所有不同的邮箱,和每个邮箱对应的用户名
        # 2.根据accounts数组对所有邮箱进行合并
        # 3.根据合并的情况，为每组找到对应的用户名
        emailToIndex = {}
        emailToName = {}
        # 因为存在重名，所以不可以用姓名来进行合并，必须通过编号
        for account in accounts:
            for ac in account[1:]:
                if ac not in emailToIndex:
                    emailToIndex[ac] = len(emailToIndex)
                    emailToName[ac] = account[0]
        uf = UF(len(emailToIndex))
        for account in accounts:
            for ac in account[2:]:
                uf.union(emailToIndex[account[1]],emailToIndex[ac])
        indexToEmail = defaultdict(list)
        for email,index in emailToIndex.items():
            indexToEmail[uf.find(index)].append(email)
        result = []
        for index,email in indexToEmail.items():
            result.append([emailToName[email[0]]]+sorted(email))
        return result

             


