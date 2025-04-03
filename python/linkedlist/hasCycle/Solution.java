package linkedlist.hasCycle;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.hasCycle
 * Description:
 *
 * @date:2025/3/4 20:38
 * @author: Junquan Yi
 */
public class Solution {
    // 141. 环形链表
    // https://leetcode.cn/problems/linked-list-cycle
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null && fast.next.next != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;


    }
}
