package linkedlist.getintersectionnode;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.getintersectionnode
 * Description:
 *
 * @date:2024/12/22 21:28
 * @author: Junquan Yi
 */
public class Solution {
    // 链表相交， easy
    // 题目:https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/
    // 解析: https://programmercarl.com/%E9%9D%A2%E8%AF%95%E9%A2%9802.07.%E9%93%BE%E8%A1%A8%E7%9B%B8%E4%BA%A4.html#%E6%80%9D%E8%B7%AF
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        int lenA = 0, lenB = 0;
        while (pA != null) {
            lenA++;
            pA = pA.next;
        }
        while (pB != null) {
            lenB++;
            pB = pB.next;
        }
        pA = headA;
        pB = headB;
        if (lenA <= lenB){
            int tmp = lenA;
            lenA = lenB;
            lenB = tmp;

            ListNode tmpA = pA;
            pA = pB;
            pB = tmpA;
        }
        int diff = lenA - lenB;
        while (diff > 0) {
            pA = pA.next;
            diff--;
        }
        while (pA != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }
}
