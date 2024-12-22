package linkedlist.detectCycle;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist
 * Description:
 *
 * @date:2024/12/22 21:46
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/linked-list-cycle-ii/description/
    // 环形链表，middle
    // 快慢指针，主要是数学知识
    // https://programmercarl.com/0142.%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8II.html#%E6%80%9D%E8%B7%AF
    // 官方题解： https://leetcode.cn/problems/linked-list-cycle-ii/solutions/441131/huan-xing-lian-biao-ii-by-leetcode-solution/
    // 也可以用哈希表，更容易理解
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {// 有环
                ListNode index1 = fast;
                ListNode index2 = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
