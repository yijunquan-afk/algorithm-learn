class Solution:
    # [383. 赎金信](https://leetcode.cn/problems/ransom-note/)
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        magazine_dict = {}
        for s in magazine:
            magazine_dict[s] = magazine_dict.get(s, 0) + 1
        for s in ransomNote:
            if s not in magazine_dict.keys():
                return False
            magazine_dict[s] = magazine_dict.get(s) - 1
            if magazine_dict.get(s) < 0:
                return False
        return True