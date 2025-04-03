package linkedlist.addTwoNumbers;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.addTwoNumbers
 * Description:
 *
 * @date:2025/3/5 15:07
 * @author: Junquan Yi
 */
public class Solution {
    // [2. 两数相加](https://leetcode.cn/problems/add-two-numbers/)
    // middle
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addFlag = 0;
        ListNode dummpy = new ListNode(-1);
        ListNode cur = dummpy;
        while(l1 != null || l2 != null || addFlag == 1){
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sumNum = num1 + num2 + addFlag;
            if(sumNum > 9) addFlag = 1;
            else addFlag = 0;
            ListNode newNode = new ListNode(sumNum % 10);
            cur.next = newNode;
            cur = cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummpy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(0);
        ListNode t1 = new ListNode(8);
        ListNode t2 = new ListNode(6);
        ListNode t3 = new ListNode(5);
        ListNode t4 = new ListNode(6);
        list1.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;


        ListNode list2 = new ListNode(6);
        ListNode t5 = new ListNode(7);
        ListNode t6 = new ListNode(8);
        ListNode t7 = new ListNode(8);
        list2.next = t5;
        t5.next = t6;
        t6.next = t7;
        System.out.println(solution.addTwoNumbers(list1, list2));
    }
}
