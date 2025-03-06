package linkedlist.insertionSortList;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.insertionSortList
 * Description:
 *
 * @date:2025/3/6 15:02
 * @author: Junquan Yi
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head.next;
        ListNode alreadyTail = head;
        while(cur != null){
            if(cur.val >= alreadyTail.val){
                alreadyTail = cur;
            }else{
                ListNode pre = dummy;
                while(pre.next.val <= cur.val){
                    pre = pre.next;
                }
                alreadyTail.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
            }
            cur = alreadyTail.next;
        }
        return dummy.next;
    }
}
