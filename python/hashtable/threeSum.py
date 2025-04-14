from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)):
            if nums[i] > 0:
                return result
            if i > 0 and nums[i] == nums[i-1]:
                continue # 去重第一个元素
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum_num = nums[i] + nums[left] + nums[right]
                if sum_num > 0:
                    right -= 1
                elif sum_num < 0:
                    left += 1
                else:
                    result.append([nums[i], nums[left], nums[right]])
                    while right > left and nums[right] == nums[right-1]:
                        right -= 1 #    去重第二个元素
                    while right > left and nums[left] == nums[left+1]:
                        left += 1 # 去重第三个元素
                    right -= 1
                    left += 1
        return result
    


if __name__ == "__main__":
    nums = [1,-1,-1,0]
    print(Solution().threeSum(nums))