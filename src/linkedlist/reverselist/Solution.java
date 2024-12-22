package linkedlist.reverselist;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.reverselist
 * Description:
 *
 * @date:2024/12/22 18:18
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/reverse-linked-list/description/
    // 翻转链表。easy
    // 解析： https://programmercarl.com/0206.%E7%BF%BB%E8%BD%AC%E9%93%BE%E8%A1%A8.html#%E6%80%9D%E8%B7%AF
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
