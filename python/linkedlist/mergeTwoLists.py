#
# @lc app=leetcode.cn id=21 lang=python3
#
# [21] 合并两个有序链表
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1: 
            return list2
        if not list2:
            return list1
        dummy = ListNode()

        pre = dummy
        while list1 and list2:
            if list1.val <= list2.val:
                pre.next = list1
                list1 = list1.next
            else:
                pre.next = list2
                list2 = list2.next
            pre = pre.next
        if list1:
            pre.next = list1
        else:
            pre.next = list2
            
        return dummy.next
# @lc code=end

node1 = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(4)
node4 = ListNode(1)
node5 = ListNode(3)
node6 = ListNode(4)
node1.next = node2
node2.next = node3
node4.next = node5
node5.next = node6
Solution().mergeTwoLists(node1, node4)