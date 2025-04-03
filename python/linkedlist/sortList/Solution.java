package linkedlist.sortList;

import linkedlist.ListNode;

import java.util.List;

/**
 * ClassName:Solution
 * Package:linkedlist.sortList
 * Description:
 *
 * @date:2025/3/6 14:54
 * @author: Junquan Yi
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        // 归并排序：O(nlogn)
        // 递归：O(logn)的空间复杂度，迭代：O(1)的空间复杂度
        if(head == null || head.next == null) return head;
        ListNode head2 = findMiddleNode(head);
        head = sortList(head);
        head2 = sortList(head2);
        return  mergeSortList(head, head2);
    }

    ListNode findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;// 断开slow前一个节点
        return slow;
    }

    ListNode mergeSortList(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pre.next = list1;
                list1 = list1.next;
            }else{
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(4);
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(1);
        ListNode t3 = new ListNode(3);
        list1.next = t1;
        t1.next = t2;
        t2.next = t3;
        ListNode res = solution.sortList(list1);
        System.out.println(res);
    }
}
