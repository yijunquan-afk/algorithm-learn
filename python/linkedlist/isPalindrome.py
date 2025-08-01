#
# @lc app=leetcode.cn id=234 lang=python3
#
# [234] 回文链表
#

# @lc code=start
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
from typing import Optional


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        def getLength(head):
            temp = head
            length = 0
            while temp:
                length += 1
                temp = temp.next
            return length
        
        def reverseBetween(head, left, right):
            dummpy = t = ListNode(next=head)
            for _ in range(left-1):
                t = t.next
            pre = None
            cur = t.next
            for _ in range(right-left+1):
                temp = cur.next
                cur.next = pre
                pre = cur
                cur = temp
            t.next.next = cur
            t.next = pre
            return dummpy.next
        length = getLength(head)
        firstHalfEnd = int(length/2)
        secondHalfStart = firstHalfEnd + 1
        secondHalfEnd = length
        head = reverseBetween(head, secondHalfStart, secondHalfEnd)
        temp1 = temp2 = head
        for _ in range(firstHalfEnd):
            temp1 = temp1.next
        flag = True
        for _ in range(firstHalfEnd):
            if temp1.val != temp2.val:
                flag = False
            temp1 = temp1.next
            temp2 = temp2.next
        
        # reverseBetween(head, secondHalfStart, secondHalfEnd)
        return flag
                
        
# @lc code=end

node1 = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(2)
node4 = ListNode(1)
node5 = ListNode(5)
node1.next = node2
node2.next = node3
node3.next = node4
Solution().isPalindrome(node1)