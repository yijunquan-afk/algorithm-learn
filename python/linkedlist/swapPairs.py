#
# @lc app=leetcode.cn id=24 lang=python3
#
# [24] 两两交换链表中的节点
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        cur = dummy
        while cur.next and cur.next.next:
            first = cur.next
            second = cur.next.next
            third = cur.next.next.next
            cur.next = second
            second.next = first
            first.next = third
            cur = cur.next.next
        return dummy.next
# @lc code=end

