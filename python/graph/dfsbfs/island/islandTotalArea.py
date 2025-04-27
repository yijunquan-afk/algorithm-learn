from collections import deque

directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]
count = 0

def bfs(graph, visited, x, y):
    visited[x][y] = True
    que = deque()
    que.append((x, y))
    global count
    count += 1
    while que:
        cur_x, cur_y = que.popleft()
        graph[cur_x][cur_y] = 0
        for i, j in directions:
            next_x = cur_x + i
            next_y  = cur_y + j
            if next_x < 0 or next_x >= len(graph) or next_y < 0 or next_y >= len(graph[0]):
                continue
            if not visited[next_x][next_y] and graph[next_x][next_y] == 1:
                visited[next_x][next_y] = True
                que.append((next_x, next_y))
                count += 1

if __name__ == "__main__":
    n, m = map(int, input().split())
    graph = []
    for _ in range(n):
        graph.append(list(map(int, input().split())))
    visited = [[False] * m for _ in range(n)]
    for i in range(n):
        if graph[i][0] == 1 and not visited[i][0]:
            bfs(graph, visited, i, 0)
        if graph[i][m-1] == 1 and not visited[i][m-1]:
            bfs(graph, visited, i, m-1)
    for j in range(m):
        if graph[0][j] == 1 and not visited[0][j]:
            bfs(graph, visited, 0, j)
        if graph[n-1][j] == 1 and not visited[n-1][j]:
            bfs(graph, visited, n-1, j)
    visited = [[False] * m for _ in range(n)]
    count = 0
    for i in range(n):
        for j in range(m):
            if not visited[i][j] and graph[i][j] == 1:
                bfs(graph, visited, i, j)
    print(count)
