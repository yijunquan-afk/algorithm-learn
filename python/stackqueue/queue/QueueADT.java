package stackqueue.queue;

/**
 * ClassName:QueueADT
 * Package:stackqueue.queue
 * Description:
 *
 * @date:2024/12/26 16:59
 * @author: Junquan Yi
 */
public interface QueueADT <E>{
    //定义队列的抽象数据类型
    public void clear();//清空队列
    public void enqueue(E it);//入队
    public E dequeue();//出队
    public E firstValue();//；获得队首元素
    public boolean isEmpty();//判断队列是否空
    public boolean isFull();//判断队列是否为满
    public void print();//打印队列
    public int size();//获得队列中实际的元素个数
}