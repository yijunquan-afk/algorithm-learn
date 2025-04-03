def quickpow(a,b,p):
    if b == 0:
        return 1
    elif b % 2 == 1: # 奇数
        return quickpow(a, b-1, p) * a % p
    else:
        temp = quickpow(a, b / 2, p)
        return temp * temp % p

# n = int(input())
# for i in range(n):
#     a,b,p = map(int, input().split())
#     print(quickpow(a,b,p))

class Solution:
    def myPow(self, x: float, n: int) -> float:
        def quickPow(x, n):
            result = 1
            while n > 0:
                if n & 1:
                    result = result * x
                x = x * x
                n = n >> 1 # 右移1位
                # print(n)
                print(result)
            return result    
        return quickPow(x, n) if n >= 0 else 1.0/quickPow(x, -n)


       
if __name__ == "__main__":
    print(Solution().myPow(2, 10))
        