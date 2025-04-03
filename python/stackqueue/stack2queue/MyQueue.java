package stackqueue.stack2queue;

import java.util.Stack;

/**
 * ClassName:MyQueue
 * Package:stackqueue.stack2queue
 * Description:
 *
 * @date:2024/12/26 18:37
 * @author: Junquan Yi
 */
class MyQueue {
    // 请你仅使用两个栈实现先入先出队列。
    // https://leetcode.cn/problems/implement-queue-using-stacks/description/
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    // 关键是这两个方法
    // pop和peak前判断输出栈是否为空，是的话才把stack1中的加进去
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return  stack1.empty() && stack2.empty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(myQueue.pop());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

