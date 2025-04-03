package linkedlist.designlinkedlist;

import linkedlist.ListNode;

/**
 * ClassName:MyLinkedList
 * Package:linkedlist.designlinkedlist
 * Description:
 *
 * @date:2024/12/22 17:48
 * @author: Junquan Yi
 */


class MyLinkedList {
    // 题目: https://leetcode.cn/problems/design-linked-list/
    // 设计链表, middle
    //size存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode dummyHead;
    public MyLinkedList() {
        this.size = 0;
        this.dummyHead = new ListNode(0);
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return - 1;
        }
        ListNode tmp = dummyHead;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode tmp = dummyHead;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode newNode = new ListNode(val);
        ListNode tmp = dummyHead;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        ListNode tmp = dummyHead;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */