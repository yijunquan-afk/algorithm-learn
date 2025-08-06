#
# @lc app=leetcode.cn id=19 lang=python3
#
# [19] 删除链表的倒数第 N 个结点
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        tmp = head
        cur = dummy
        length = 0
        while tmp:
            length += 1
            tmp = tmp.next
        order = length - n
        for _ in range(order):
            cur = cur.next
        cur.next = cur.next.next
        return dummy.next
            
# @lc code=end

