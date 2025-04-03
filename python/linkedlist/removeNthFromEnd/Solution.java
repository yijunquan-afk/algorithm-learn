package linkedlist.removeNthFromEnd;

import linkedlist.ListNode;

/**
 * ClassName:Solution
 * Package:linkedlist.removeNthFromEnd
 * Description:
 *
 * @date:2024/12/22 21:12
 * @author: Junquan Yi
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 删除链表的倒数第 N 个结点，middle
        // 题目: https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/
        // 解析: https://programmercarl.com/0019.%E5%88%A0%E9%99%A4%E9%93%BE%E8%A1%A8%E7%9A%84%E5%80%92%E6%95%B0%E7%AC%ACN%E4%B8%AA%E8%8A%82%E7%82%B9.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        while (fast.next != null) {
            fast = fast.next;
            if (n > 0){
                n--;
            }else {
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
