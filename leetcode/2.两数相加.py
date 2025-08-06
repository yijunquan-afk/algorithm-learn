#
# @lc app=leetcode.cn id=2 lang=python3
#
# [2] 两数相加
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
        dummy = ListNode(-1)
        cur = dummy
        addFlag = 0
        while l1 or l2 or addFlag == 1:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            sum_num = val1 + val2 + addFlag
            if sum_num > 9: 
                addFlag = 1
            else:
                addFlag = 0
            newNode = ListNode(sum_num%10)
            cur.next = newNode
            cur = cur.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
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
Solution().addTwoNumbers(node1, node4)