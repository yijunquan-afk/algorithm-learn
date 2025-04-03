package stackqueue.queue;

/**
 * ClassName:AQueueTest
 * Package:stackqueue.queue
 * Description:
 *
 * @date:2024/12/26 17:08
 * @author: Junquan Yi
 */
public class AQueueTest {
    public static void main(String[] args) {
        AQueue<Integer> test = new AQueue<>();
        test.print();
        test.enqueue(1);
        test.enqueue(21);
        test.enqueue(3);
        test.enqueue(43);
        test.enqueue(3);
        test.enqueue(7);
        System.out.print("enqueue: ");
        test.print();
        System.out.println("the number of queue elements: " + test.size());
        System.out.println("get the front element: "+test.firstValue());
        test.dequeue();
        test.dequeue();
        System.out.print("dequeue two elements: ");
        test.print();
    }
}
