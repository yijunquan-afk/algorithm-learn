package stackqueue.stack;

/**
 * ClassName:Link
 * Package:stackqueue.stack
 * Description:
 *
 * @date:2024/12/26 16:53
 * @author: Junquan Yi
 */
public class Link <E> {
    //结点类
    private E element;
    private Link next; //指向的下一个结点
    //构造方法
    public Link(E element, Link next) {
        this.element = element;
        this.next = next;
    }

    public Link(Link next) {
        this.next = next;
    }
    //getter和setter
    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
