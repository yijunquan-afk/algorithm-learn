package stackqueue.queue2stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName:MyStack
 * Package:stackqueue.queue2stack
 * Description:
 *
 * @date:2024/12/26 19:05
 * @author: Junquan Yi
 */
class MyStack {
    // 用队列实现栈，easy
    // https://leetcode.cn/problems/implement-stack-using-queues/
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
    }

    private void operate(){
        int size = q.size();
        while(size > 1){
            q.offer(q.poll());
            size--;
        }
    }
    public int pop() {
        operate();
        return q.poll();
    }

    public int top() {
        operate();
        int res = q.peek();
        q.offer(q.poll());
        // 保持顺序
        return res;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
