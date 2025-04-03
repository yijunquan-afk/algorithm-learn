package linkedlist.swappairs;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.swappairs
 * Description:
 *
 * @date:2024/12/22 20:39
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/swap-nodes-in-pairs/
    // 两两交换链表中的节点, middle
    // 解析: https://programmercarl.com/0024.%E4%B8%A4%E4%B8%A4%E4%BA%A4%E6%8D%A2%E9%93%BE%E8%A1%A8%E4%B8%AD%E7%9A%84%E8%8A%82%E7%82%B9.html#%E6%80%9D%E8%B7%AF
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            ListNode node3 = cur.next.next.next;
            cur.next = node2;
            node2.next = node1;
            node1.next = node3;
            cur = node1;
        }
        return dummy.next;
    }
}
