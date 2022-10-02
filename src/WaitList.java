import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements iWaitList<E> {

    protected Deque<E> content = new ConcurrentLinkedDeque<E>();

    public WaitList() {}

    public WaitList(Collection<E> c) {
        content.addAll(c);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        Deque<E> temp_deq = new ConcurrentLinkedDeque<E>(content);
        String temp_str = new String();
        for (int i = 0; i < content.size(); i++) {
            temp_str += temp_deq.removeFirst() + " ";
        }
        return temp_str;
    }
}
