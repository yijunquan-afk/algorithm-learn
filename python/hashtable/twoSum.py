from ast import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_dict = {}
        for i in range(len(nums)):
            if target - nums[i] in num_dict.keys():
                return [num_dict.get(target-nums[i]), i]
            num_dict[nums[i]] = i
        