from collections import defaultdict


def dfs(graph, visited, x):
    visited[x-1] = True
    for i in graph[x]:
        if not visited[i-1]:
            dfs(graph, visited, i)


if __name__ == "__main__":
    n,k = map(int, input().split())
    graph = defaultdict(list)
    for _ in range(k):
        s,t  = map(int, input().split())
        graph[s].append(t)
    visited = [False] * n
    dfs(graph, visited, 1)
    result = True
    for v in visited:
        if not v:
            result = False
    print(1 if result else -1)