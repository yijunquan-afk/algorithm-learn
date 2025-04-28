from typing import List


class Solution:
    def pondSizes(self, land: List[List[int]]) -> List[int]:
        dirs = [[-1, 0], [1, 0], [0, 1], [0, -1], [1, 1], [-1, -1], [1, -1], [-1, 1]]
        def dfs(x, y):
            visited[x][y] = True
            nonlocal area
            area += 1
            for i,j in dirs:
                next_x = x + i
                next_y = y + j
                if next_x < 0 or next_x >= len(land) or next_y < 0 or next_y >= len(land[0]):
                    continue
                if not visited[next_x][next_y] and land[next_x][next_y] == 0:
                    dfs(next_x, next_y)
        area = 0
        result = []
        n = len(land)  
        m = len(land[0])
        visited = [[False] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                if not visited[i][j] and land[i][j] == 0:
                    area = 0
                    dfs(i, j)
                    result.append(area)
        return sorted(result)
