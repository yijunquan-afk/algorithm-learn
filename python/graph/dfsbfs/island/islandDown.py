directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]

def dfs(grid, visited, x, y):
    visited[x][y] = True
    for i, j in directions:
        next_x = x + i
        next_y = y + j
        if next_x < 0 or next_x >= len(grid) or next_y < 0 or next_y >= len(grid[0]):
            continue
        if not visited[next_x][next_y] and grid[next_x][next_y] == 1:
            dfs(grid, visited, next_x, next_y)

if __name__ == "__main__":
    n,m = map(int, input().split())
    grid = []
    for _ in range(n):
        grid.append(list(map(int, input().split())))
    visited = [[False] * m for _ in range(n)]
    for i in range(n):
        if not visited[i][0] and grid[i][0] == 1:
            dfs(grid, visited, i, 0)
        if not visited[i][m-1] and grid[i][m-1] == 1:
            dfs(grid, visited, i, m-1)  
    for j in range(m):
        if not visited[0][j] and grid[0][j] == 1:
            dfs(grid, visited, 0, j)          
        if not visited[n-1][j] and grid[n-1][j] == 1:
            dfs(grid, visited, n-1, j)  
    for i in range(n):
        for j in range(m):
            if  not visited[i][j] and grid[i][j] == 1:
                grid[i][j] = 0
    for row in grid:
        print(" ".join(map(str, row)))            