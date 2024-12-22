package linkedlist;

/**
 * ClassName:ListNode
 * Package:listarray
 * Description:
 *
 * @date:2024/12/22 17:26
 * @author: Junquan Yi
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
