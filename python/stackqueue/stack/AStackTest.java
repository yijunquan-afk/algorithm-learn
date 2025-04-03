package stackqueue.stack;

/**
 * ClassName:AStackTest
 * Package:stackqueue.stack
 * Description:
 *
 * @date:2024/12/26 16:52
 * @author: Junquan Yi
 */
public class AStackTest {
    public static void main(String[] args) {
        AStack stack = new AStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.topValue());
        System.out.println(stack.isEmpty());
        stack.print();
    }
}
