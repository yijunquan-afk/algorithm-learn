direactions = [[1,0], [-1, 0], [0, 1], [0,-1]]


def bfs(graph, viisted, x, y):
    viisted[x][y] = True
    for i,j in direactions:
        next_x = x + i
        next_y = y + j
        if next_x < 0 or next_x >= len(graph) or next_y < 0 or next_y >= len(graph[0]):
            continue
        if not visited[next_x][next_y] and graph[next_x][next_y] == 1:
            bfs(graph, viisted, next_x, next_y)

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
                result += 1
                bfs(graph, visited, i, j)
    print(result)