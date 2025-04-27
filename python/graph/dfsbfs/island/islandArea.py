directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]
count = 0

def dfs(graph, visited, x, y):
    visited[x][y] = True
    global count
    count += 1
    for i, j in directions:
        next_x = x + i
        next_y = y + j
        if next_x < 0 or next_x >= len(graph) or next_y < 0 or next_y >= len(graph[0]):
            continue
        if not visited[next_x][next_y] and graph[next_x][next_y]:
            dfs(graph, visited, next_x, next_y)


if __name__ == "__main__":
    n,m = map(int, input().split())
    graph = []
    for _ in range(n):
        graph.append(list(map(int, input().split())))
    visited = [[False] * m for _ in range(n)]
    result = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1 and not visited[i][j]:
                count = 0
                dfs(graph, visited, i, j)
                result = max(result, count)
    print(result)

