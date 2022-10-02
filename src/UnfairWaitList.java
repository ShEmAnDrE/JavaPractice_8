import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    public void remove(E element) {
        Deque<E> temp_deq = new ConcurrentLinkedDeque<E>();
        while (!content.isEmpty()) {
            if (content.getFirst() == element) {
                content.removeFirst();
                break;
            } else {
                temp_deq.addLast(content.removeFirst());
            }
        }
        while (!temp_deq.isEmpty()) {
            content.addFirst(temp_deq.removeLast());
        }
    }

    public void moveToBack(E element) {
        remove(element);
        content.addLast(element);
    }
}
