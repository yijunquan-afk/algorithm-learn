package stackqueue.checkout;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName:Checkout
 * Package:stackqueue.checkout
 * Description:
 *
 * @date:2024/12/27 14:56
 * @author: Junquan Yi
 */
class Checkout {
    // 题目: LCR 184. 设计自助结算系统,middle
    // https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/description/
    Queue<Integer> queue; // 负责正常的插入删除
    Deque<Integer> deque; // 负责维护单调队列
    public Checkout() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int get_max() {
        if(deque.isEmpty()) return -1;
        return deque.peekFirst();
    }

    public void add(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int remove() {
        if(queue.isEmpty()) return -1;
        int ans = queue.poll();
        if(ans==deque.peekFirst()){
            deque.pollFirst();
        }
        return ans;
    }
}

/**
 * Your Checkout object will be instantiated and called as such:
 * Checkout obj = new Checkout();
 * int param_1 = obj.get_max();
 * obj.add(value);
 * int param_3 = obj.remove();
 */
