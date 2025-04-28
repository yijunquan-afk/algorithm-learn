from collections import List

class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        def dfs(x):
            visited[x] = True
            for room in rooms[x]:
                if not visited[room]:
                    dfs(room)
        n = len(rooms)
        visited = [False] * n
        dfs(0)
        for visit in visited:
            if not visit:
                return False
        return True