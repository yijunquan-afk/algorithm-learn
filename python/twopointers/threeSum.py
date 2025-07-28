from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort() # 先排序
        res = []
        n = len(nums)
        for i in range(n):
            if nums[i] > 0: # 减枝
                break
            if i > 0 and nums[i] == nums[i-1]: # 去重
                continue
            left = i + 1
            right = n - 1
            while left < right:
                sum_num = nums[i] + nums[left] + nums[right]
                if sum_num < 0:
                    left += 1
                elif sum_num > 0:
                    right -= 1
                else:
                    res.append([nums[i], nums[left], nums[right]])
                    # 去重复
                    while left < right and nums[left] == nums[left+1]:
                        left += 1
                    while left < right and nums[right] == nums[right-1]:
                        right -= 1
                    left += 1
                    right -= 1
        return res

        

if __name__  == "__main__":
    solution = Solution()
    nums = [1,-1,-1,0]
    print(solution.threeSum(nums))