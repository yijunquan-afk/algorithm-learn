class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = defaultdict(list)
        in_degree = [0] * numCourses
        for a,b in prerequisites:
            graph[b].append(a)
            in_degree[a] += 1
        q = deque([i for i, d in enumerate(in_degree) if d == 0])
        topo = []
        while q:
            cur = q.popleft()
            topo.append(cur)
            for course in graph[cur]:
                in_degree[course] -= 1
                if in_degree[course] == 0:
                    q.append(course)
        return len(topo) == numCourses
        
        