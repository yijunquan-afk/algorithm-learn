from collections import defaultdict, deque
from typing import List


class Solution:
    def minimumTime(self, n: int, relations: List[List[int]], time: List[int]) -> int:
        graph = defaultdict(list)
        in_degree = [0] * n
        for x,y in relations:
            graph[x-1].append(y-1)
            in_degree[y-1] += 1
        q = deque([i for i,d in enumerate(in_degree) if d == 0])
        dp = [0] * n
        while q:
            cur = q.popleft() # x 出队，意味着 x 的所有先修课都上完了
            dp[cur] = dp[cur] + time[cur] # 加上当前课程的时间，就得到了最终的 f[x]
            for nex in graph[cur]: # 遍历 x 的邻居 y
                # # 更新 f[y] 的所有先修课程耗时的最大值
                dp[nex] = max(dp[nex], dp[cur])
                in_degree[nex] -= 1
                if in_degree[nex] == 0:
                    q.append(nex)
        return max(dp)


        