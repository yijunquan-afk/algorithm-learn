#
# @lc app=leetcode.cn id=69 lang=python3
#
# [69] x 的平方根 
#

# @lc code=start
class Solution:
    def mySqrt(self, x: int) -> int:
        left = 1
        right = x
        while(left <= right):
            mid = int((right-left)/2) + left
            temp = mid * mid
            if temp == x:
                return mid
            elif temp > x:
                right = mid - 1
            else:
                left = mid + 1
        return left - 1
        
# @lc code=end

