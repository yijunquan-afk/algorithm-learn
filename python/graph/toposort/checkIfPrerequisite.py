from collections import defaultdict, deque
from typing import List


class Solution:
    def checkIfPrerequisite(self, numCourses: int, prerequisites: List[List[int]], queries: List[List[int]]) -> List[bool]:
        graph = defaultdict(list)
        in_degree = [0] * numCourses
        for s,t in prerequisites:
            graph[s].append(t)
            in_degree[t] += 1
        q = deque()
        for i in range(numCourses):
            if in_degree[i] == 0:
                q.append(i)
        topo_sort = []
        isPre = [[False] * numCourses for _ in range(numCourses)]
        while q:
            cur = q.popleft()
            for t in graph[cur]:
                isPre[cur][t] = True
                for i in range(numCourses):
                    isPre[i][t] = isPre[i][t] or isPre[i][cur]
                in_degree[t] -= 1
                if in_degree[t] == 0:
                    q.append(t)
        result = []
        for query in queries:
            result.append(isPre[query[0]][query[1]])
        return result
