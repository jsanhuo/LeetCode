#time:40ms;memory:14.8MB
class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        length = len(matrix)
        for j in range(length//2):
            t = []
            l = []
            r = []
            d = []
            for i in range(j,length-j):
                t.append(matrix[j][i])
                l.append(matrix[i][j])
                r.append(matrix[i][-(j+1)])
                d.append(matrix[-(j+1)][i])
            k = 0
            for i in range(j,length-j):
                matrix[j][i] = l[-(k+1)]
                matrix[i][j] = d[k]
                matrix[i][-(j+1)] = t[k]
                matrix[-(j+1)][i] = r[-(k+1)]
                k+=1
