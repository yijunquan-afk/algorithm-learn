class Solution:
    # 202. 快乐数
    # https://leetcode.cn/problems/happy-number/description/
    def isHappy(self, n: int) -> bool:
        num_set = set()
        num_set.add(n)
        while n > 1:
            temp = n
            next_n = 0
            while temp > 0:
                temp, digit = divmod(temp, 10) 
                # divmod 是一个非常方便的函数，可以同时获取商和余数，避免了分别使用 // 和 % 的麻烦。
                next_n += digit * digit
            n = next_n
            
            if n in num_set:
                return False
            else:
                num_set.add(n)
        return True
    
if __name__ == "__main__":
    print(Solution().isHappy(19))
    