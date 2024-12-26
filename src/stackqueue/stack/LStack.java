package stackqueue.stack;

/**
 * ClassName:LStack
 * Package:stackqueue.stack
 * Description:
 *
 * @date:2024/12/26 16:55
 * @author: Junquan Yi
 */
public class LStack<E> implements StackADT<E> {
    private Link<E> top;//栈顶元素

    //初始化与构造器
    private void setUp() {
        top = null;
    }

    public LStack() {
        setUp();
    }

    public LStack(int size) {
        setUp();
    }

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public void push(E it) {
        top = new Link<E>(it, top);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        E it = top.getElement();
        top = top.getNext();
        return it;
    }

    @Override
    public E topValue() {
        if (isEmpty()) {
            System.out.println("no top value");
            return null;
        }
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        Link<E> temp = top;
        while (temp != null) {
            System.out.println(temp.getElement());
            temp = temp.getNext();
        }
    }
}
