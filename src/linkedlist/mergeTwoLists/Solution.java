package linkedlist.mergeTwoLists;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.mergeTwoLists
 * Description:
 *
 * @date:2025/3/5 13:55
 * @author: Junquan Yi
 */
public class Solution {
    // [21. 合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(0);
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
        if(list1 != null){
            pre.next = list1;
        }else{
            pre.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(4);
        list1.next = t1;
        t1.next = t2;


        ListNode list2 = new ListNode(1);
        ListNode t3 = new ListNode(2);
        ListNode t4 = new ListNode(4);
        list2.next = t3;
        t3.next = t4;
//        System.out.println(solution.mergeTwoLists(list1,list2));
        System.out.println(solution.mergeTwoLists(new ListNode(5),list2));
    }
}
