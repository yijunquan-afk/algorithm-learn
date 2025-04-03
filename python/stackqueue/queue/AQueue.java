package stackqueue.queue;

/**
 * ClassName:AQueue
 * Package:stackqueue.queue
 * Description:
 *
 * @date:2024/12/26 16:59
 * @author: Junquan Yi
 */
public class AQueue<E> implements QueueADT<E> {
    //定义顺序队
    private static final int DEFAULT_SIZE=10;
    private int max_size;//定义队列的实际最大容纳量+1
    private int size;//队列中实际的元素个数
    private int front;//队首元素的前驱元素下标
    private int rear;//队尾元素下标
    private E[] listArray;//存储元素的下标

    private void setUp(int size){
        this.max_size=size+1;
        front=rear=0;
        listArray=(E[])new Object[size+1];
    }

    public AQueue() {
        setUp(DEFAULT_SIZE);
    }
    public AQueue(int size){
        setUp(size);
    }

    @Override
    public void clear() {
        front=rear=0;
    }

    @Override
    public void enqueue(E it) {
        if (isFull()){
            System.out.println("queue is full!");
            return;//队列已经满了
        }
        rear=(rear+1)%max_size;
        listArray[rear]=it;
        this.size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            System.out.println("queue is empty!");
            return null;
        }
        front=(front+1)%max_size;
        size--;
        E it=listArray[front];
        return it;
    }

    @Override
    public E firstValue() {
        if (isEmpty()){
            System.out.println("queue is empty!");
            return null;
        }
        return listArray[(front+1)%max_size];
    }

    @Override
    public boolean isEmpty() {
        return front==rear;
    }

    @Override
    public boolean isFull() {
        return (rear+1)%max_size==front;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int temp= front+1;
        while((temp%max_size)!=rear){
            System.out.print(listArray[temp]+" ");
            temp++;
        }
        System.out.println(listArray[temp]);
    }

    @Override
    public int size() {
        return size;
    }

}
