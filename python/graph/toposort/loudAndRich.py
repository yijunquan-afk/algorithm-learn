from typing import List
from collections import defaultdict, deque
class Solution:
    def loudAndRich(self, richer: List[List[int]], quiet: List[int]) -> List[int]:
        graph = defaultdict(list)
        n = len(quiet)
        in_degree = [0] * n
        for a,b in richer:
            graph[a].append(b)
            in_degree[b] += 1
        q = deque()
        for i in range(n):
            if in_degree[i] == 0:
                q.append(i)
        result = list(range(n)) # 初始化为自己
        while q:
            cur = q.popleft()
            for b in graph[cur]: # 比cur更穷的人
                # 如果cur比这些人更喧嚣
                if quiet[result[cur]] < quiet[result[b]]:
                    # 更新这些人的答案
                    result[b] = result[cur]
                in_degree[b] -= 1
                if in_degree[b] == 0:
                    q.append(b)
        return  result

if __name__ == "__main__":
    richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]]
    quiet = [3,2,5,4,6,1,7,0]
    print(Solution().loudAndRich(richer, quiet))