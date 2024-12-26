package stackqueue.stack;

/**
 * ClassName:StackADT
 * Package:stackqueue.stack
 * Description:
 *
 * @date:2024/12/26 16:42
 * @author: Junquan Yi
 */
public interface StackADT<E> {
    public void clear();//清空栈中所有元素
    public void push(E it);//压栈
    public E pop();//出栈
    public E topValue();//返回栈顶元素
    public boolean isEmpty();//判断栈是否空
    public void print();//打印栈中的所有元素
}
