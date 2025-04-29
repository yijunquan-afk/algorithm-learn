from collections import defaultdict,deque
from typing import List
class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        in_degree = [0] * numCourses
        graph = defaultdict(list)
        for t,s in prerequisites:
            graph[s].append(t)
            in_degree[t] += 1
        q = deque()
        for i in range(numCourses):
            if in_degree[i] == 0:
                q.append(i)
        sort_classes = []
        while q:
            cur = q.popleft()
            sort_classes.append(cur)
            for t in graph[cur]:
                in_degree[t] -= 1
                if in_degree[t] == 0 :
                    q.append(t)
        if len(sort_classes) != numCourses:
            return []
        return sort_classes