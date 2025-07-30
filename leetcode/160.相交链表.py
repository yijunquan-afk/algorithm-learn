#
# @lc app=leetcode.cn id=160 lang=python3
#
# [160] 相交链表
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        temp1 = headA
        temp2 = headB
        len1 = len2 = 0
        while temp1:
            len1 += 1
            temp1 = temp1.next
        while temp2:
            len2 += 1
            temp2 = temp2.next
        temp1 = headA
        temp2 = headB
        if len1 < len2:
            len1, len2 = len2, len1
            temp1, temp2 = temp2, temp1
        diff = len1 - len2
        while diff:
            temp1 = temp1.next
            diff -= 1
        while temp1:
            if temp1 == temp2:
                return temp1
            temp1 = temp1.next
            temp2 = temp2.next
        return None    
        
    
    # 方法二：哈希表
    # def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
    #     nodeSet = set()
    #     temp = headA
    #     while temp:
    #         nodeSet.add(temp)
    #         temp = temp.next
    #     temp = headB
    #     while temp:
    #         if temp in nodeSet:
    #             return temp
    #         temp = temp.next
    #     return None
        
        
# @lc code=end
if __name__ == "__main__":
    x,y = 1, 2
    x, y = y, x
    print(x, y)

