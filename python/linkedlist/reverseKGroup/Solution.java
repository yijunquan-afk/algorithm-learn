package linkedlist.reverseKGroup;

import linkedlist.ListNode;

import java.util.List;

/**
 * ClassName:Solution
 * Package:linkedlist.reverseKGroup
 * Description:
 *
 * @date:2025/3/6 17:08
 * @author: Junquan Yi
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while(head != null){
            ListNode tail = pre;
            for(int i = 0 ; i < k ; i++){
                tail = tail.next;
                if(tail == null){
                    return dummy.next; // 不足k个
                }
            }
            ListNode nextNode = tail.next;
            ListNode[] revRes = reverseList(head, tail);
            head = revRes[0];
            tail = revRes[1];
            pre.next = head;
            tail.next = nextNode;
            head = tail.next;// 轮到下一个
            pre = tail;
        }
        return dummy.next;
    }

    public ListNode[] reverseList(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode cur = head;
        while (pre != tail) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return new ListNode[]{tail, head};
    }
}
