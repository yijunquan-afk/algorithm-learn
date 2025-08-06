#
# @lc app=leetcode.cn id=445 lang=python3
#
# [445] 两数相加 II
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        tmp1 = l1
        tmp2 = l2
        len1 = len2 = 0
        while tmp1:
            len1 += 1
            tmp1 = tmp1.next
        while tmp2:
            len2 += 1
            tmp2 = tmp2.next
        if len1 < len2:
            l1, l2 = l2, l1
            len1, len2 = len2, len1
        for _ in range(len1 - len2):
            l1 = l1.next
        x
# @lc code=end

