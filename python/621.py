#time:744ms;memory:14.7MB
class Solution:
    def leastInterval(self, tasks, n):
        freq = collections.Counter(tasks)

        # 任务类别数目
        m = len(freq)
        nextValid = [1] * m
        rest = list(freq.values())
        #初始化时间
        time = 0
        for i in range(len(tasks)):
            time += 1
            #找出最近运行的
            minNextValid = min(nextValid[j] for j in range(m) if rest[j] > 0)
            #当最近运行的时间比time大时候，需要进行轮空，则直接跳过
            time = max(time, minNextValid)
            #找出被执行的任务
            best = -1
            for j in range(m):
                #当前编号任务数不为0而且剩余最多的任务
                if rest[j]>0 and nextValid[j] <= time and (best == -1 or rest[j] > rest[best]):
                        best = j
            nextValid[best] = time + n + 1
            rest[best] -= 1

        return time