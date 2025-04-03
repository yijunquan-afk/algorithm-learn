package linkedlist.isPalindrome;

import linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
* ClassName:Solution
* Package:linkedlist.isPalindrome
* Description:
* @date:2025/3/4 11:14
* @author: Junquan Yi
*/
public class Solution {
    // 234. 回文链表
    // https://leetcode.cn/problems/palindrome-linked-list
    public boolean isPalindrome1(ListNode head) {
        List<Integer> valList = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            valList.add(temp.val);
            temp = temp.next;
        }
        int left = 0 , right = valList.size()-1;
        while(left < right){
            if(valList.get(left) != valList.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        // 空间复杂度为O(1)的做法
        if(head == null) return true;
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if(length == 1) return true;
        int half = length/2;
        ListNode temp2 = head;
        while(temp2 != null && half > 0){
            temp2 = temp2.next;
            half--;
        }
        ListNode firstHalf = head;
        if(length %2 != 0){
            temp2 = temp2.next;
        }
        ListNode secondHalf = reverseHalfOfNodes(temp2);

        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        temp2.next = reverseHalfOfNodes(temp2); // 还原
        return true;
    }

    ListNode reverseHalfOfNodes(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while(cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(solution.isPalindrome2(node1));
    }
}

