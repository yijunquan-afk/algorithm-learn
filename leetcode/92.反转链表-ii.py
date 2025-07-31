#
# @lc app=leetcode.cn id=92 lang=python3
#
# [92] 反转链表 II
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if not head.next:
            return head
        dummy = ListNode()
        dummy.next = head
        t = dummy
        for _ in range(left-1):
            t = t.next
        prev = None
        cur = t.next
        for _ in range(right-left + 1):
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
        t.next.next = cur
        t.next = prev
        return dummy.next
# @lc code=end
node1 = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(3)
node4 = ListNode(4)
node5 = ListNode(5)
node1.next = node2
# node2.next = node3
# node3.next = node4
# node4.next = node5
res = Solution().reverseBetween(node1, 1, 1)
print(res)

