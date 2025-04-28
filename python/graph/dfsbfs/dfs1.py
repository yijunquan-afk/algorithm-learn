# 使用邻接矩阵实现DFS
def dfs(graph, s, t, path, result):
    if s == t:
        result.append(path.copy())
        return
    for i in range(1, t+1):
        if graph[s][i] == 1:
            path.append(i)
            dfs(graph, i, t, path, result)
            path.pop()

def main():
    n,m = map(int, input().split())
    graph = [[0] * (n + 1) for _ in range(n + 1)]
    for _ in range(m):
        s,t = map(int, input().split())
        graph[s][t] = 1
    result = []
    dfs(graph, 1, n, [1], result)
    if not result:
        print(-1)
    else:
        for temp in result:
            print(" ".join(map(str, temp)))

if __name__ == "__main__":
    main()