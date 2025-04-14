from typing import List
class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        # [18. 四数之和](https://leetcode.cn/problems/4sum/)
        nums.sort()
        result = []
        n = len(nums)
        for i in range(n):
            if i > 0 and nums[i] == nums[i-1]:
                continue # 去重
            if nums[i] >= 0 and nums[i] > target:
                break
            for j in range(i+1, n):
                if j > i+1 and nums[j] == nums[j-1]:
                    continue # 去重    
                if nums[i]+nums[j] >= 0 and nums[i] + nums[j] > target:
                    break        
                left = j + 1
                right = n - 1
                while left < right:
                    sum_ = nums[i] + nums[j] + nums[left] + nums[right]
                    if sum_ < target:
                        left += 1
                    elif sum_ > target:
                        right -= 1
                    else:
                        result.append([nums[i], nums[j], nums[left], nums[right]])
                        while left < right and nums[left] == nums[left+1]: 
                            left += 1
                        while left < right and nums[right] == nums[right-1]:
                            right -= 1
                        left += 1
                        right -= 1
            
        return result

if __name__ == "__main__":
    nums = [1,0,-1,0,-2,2]
    target = 0
    print(Solution().fourSum(nums, target))