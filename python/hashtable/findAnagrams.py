from collections import Counter
from typing import List


class Solution:

    def findAnagrams(self, s: str, p: str) -> List[int]:
        n = len(s)
        m = len(p)
        res = []
        first_s = s[:m]
        flag = False
        sp = "".join(sorted(p))
        if "".join(sorted(first_s)) == sp:
            res.append(0)
            flag = True
        for i in range(1, n-m+1):
            end = i + m -1
            if flag:
                if s[i-1] == s[end]:
                    res.append(i)
                else:
                    flag = False
            else:
                sub_s = s[i:end+1]
                if "".join(sorted(sub_s)) == sp:
                    res.append(i)
                    flag = True
        return res

    # def findAnagrams(self, s: str, p: str) -> List[int]:
    #     res = []
    #     m = len(p)
    #     cnt_p = Counter(p)
    #     cnt_s = Counter()
    #     for right, c in enumerate(s):
    #         cnt_s[c] += 1 # 右边进入
    #         left = right - m + 1
    #         if left < 0:
    #             continue
    #         if cnt_s == cnt_p:
    #             res.append(left)
    #         cnt_s[s[left]] -= 1 # 左边离开
    #     return res
    
if __name__ == "__main__":
    s = "cbaebabacd"
    p = "abc"
    print(Solution().findAnagrams(s, p))