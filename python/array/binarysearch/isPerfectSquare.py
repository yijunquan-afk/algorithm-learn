#
# @lc app=leetcode.cn id=367 lang=python3
#
# [367] 有效的完全平方数
#

# @lc code=start
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        left = 1
        right = num
        while(left <= right):
            mid = int((right-left)/2)+left
            temp = mid * mid
            if temp == num:
                return True
            elif temp > num:
                right = mid - 1
            else:
                left = mid + 1
        return False
        
# @lc code=end

