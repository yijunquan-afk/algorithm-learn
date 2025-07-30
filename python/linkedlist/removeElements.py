#
# @lc app=leetcode.cn id=203 lang=python3
#
# [203] 移除链表元素
#

# @lc code=start
# Definition for singly-linked list.


from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next



class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        temp = dummy
        while temp and temp.next:
            if temp.next.val == val:
                temp.next = temp.next.next
            else:
                temp = temp.next
        return dummy.next
# @lc code=end
if __name__ == "__main__":
    node1 = ListNode(7)
    node2 = ListNode(7)
    node3 = ListNode(7)
    node4 = ListNode(7)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    res = Solution().removeElements(node1, 7)

