package linkedlist.removenode;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:listarray.removenode
 * Description:
 *
 * @date:2024/12/22 17:29
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/remove-linked-list-elements/
    // 移除链表元素, easy
    // 解析: https://programmercarl.com/0203.%E7%A7%BB%E9%99%A4%E9%93%BE%E8%A1%A8%E5%85%83%E7%B4%A0.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE
    public ListNode removeElements(ListNode head, int val) {
        // 虚拟头节点
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }

        return dummy.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        // 原地处理
        while (head != null && head.val == val) {
            head = head.next;
        }// 先处理头节点
        if (head == null) {
            return head;
        }// 头节点为空
        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

    }
}
