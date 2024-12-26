package stackqueue.stack;

import java.util.Stack;

/**
 * ClassName:AStack
 * Package:stackqueue.stack
 * Description:
 *
 * @date:2024/12/26 16:44
 * @author: Junquan Yi
 */
public class AStack<E> implements StackADT<E> {
    private final int DEFAULT_SIZE = 10;
    private int size;
    private int top;
    private E[] listArray;

    private void setup(int size) {
        this.listArray = (E[]) new Object[size];
        this.size = size;
        this.top = 0;
    }

    public AStack() {
        setup(DEFAULT_SIZE);
    }

    public AStack(int size) {
        setup(size);
    }

    @Override
    public void clear() {
        this.top = 0;
    }

    @Override
    public void push(E it) {
        if (top >= size) {
            System.out.println("stack overflow");
            return;
        }
        listArray[top++] = it;
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        return listArray[--top];
    }

    @Override
    public E topValue() {
        if(isEmpty()) return null;
        return listArray[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("empty");
        }
        for (int i=top-1;i>=0;i--){
            System.out.println(listArray[i]);
        }
    }
}
