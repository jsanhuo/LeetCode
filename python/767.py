class Solution(object):
    def reorganizeString(self, S):
        """
        :type S: str
        :rtype: str
        """
        from collections import Counter
        sCounter = Counter(S)
        k, v = max(sCounter.items(), key=lambda x: x[1])
        if v > (len(S) + 1) // 2:
            return ""
        heap = [(-x[1], x[0]) for x in sCounter.items()]
        result = ""
        heapq.heapify(heap)
        while len(heap) > 1:
            k, v = heappop(heap)
            k1, v1 = heappop(heap)
            result += v + v1
            if (k + 1 < 0):
                heappush(heap, (k + 1, v))
            if (k1 + 1 < 0):
                heappush(heap, (k1 + 1, v1))
        if len(heap) > 0:
            result += heap[0][1]
        return result

