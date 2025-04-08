class Solution:
    def countGoodNumbers(self, n: int) -> int:
        mod = 10**9 + 7
        def quickPow(x: int, n: int) -> int:
            res = 1
            while n > 0:
                if n & 1:
                    res =res * x % mod
                x = x * x % mod
                n = n >> 1
            return res
        
        return quickPow(5, (n+1)//2) * quickPow(4, n//2)% mod
        