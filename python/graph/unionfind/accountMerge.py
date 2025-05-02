from collections import defaultdict
from typing import List
class UnionFind:
    def __init__(self, n: int) -> None:
        self.father = list(range(n))
    
    def union(self, x: int, y: int) -> None:
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        self.father[y] = x
    
    def find(self, x: int) -> int:
        if x != self.father[x]:
            self.father[x] = self.find(self.father[x]) # 路经压缩
        return self.father[x]
    

class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        email_to_id = {}

        uf = UnionFind(len(accounts))

        # 每个邮箱对应一个id
        '''
        {'johnsmith@mail.com': 1, 'john_newyork@mail.com': 0, 
        'john00@mail.com': 1, 'mary@mail.com': 2, 'johnnybravo@mail.com': 3}
        '''
        for i, account in enumerate(accounts):
            for email in account[1:]:
                if email in email_to_id:
                    uf.union(i, email_to_id[email])
                email_to_id[email] = i
        
        # k,v分别为账户、邮箱列表
        '''
        {0: ['johnsmith@mail.com', 'john_newyork@mail.com', 
        'john00@mail.com'], 2: ['mary@mail.com'], 3: ['johnnybravo@mail.com']})
        '''
        email_list_by_root = defaultdict(list)
        for email, ID in email_to_id.items():
            root = uf.find(ID)
            email_list_by_root[root].append(email)

        # 组装最终结果
        ans = []
        for root, emails in email_list_by_root.items():
            ans.append([accounts[root][0]] + sorted(emails))

        return ans

if __name__ == "__main__":
    accounts = [["John", "johnsmith@mail.com", "john_newyork@mail.com", "john00@mail.com"], ["Mary", "mary@mail.com"], ["John", "johnnybravo@mail.com"]]
    print(Solution().accountsMerge(accounts))