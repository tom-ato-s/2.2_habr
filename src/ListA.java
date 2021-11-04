import java.util.LinkedList;
import java.util.NoSuchElementException;

class LinketList<E>
//        extends AbstractSequentialList<E>
//implements List<E>, Deque<E>, Cloneable<E>, java.io.Serializable
{
    private transient Entry heder = new Entry(null, null, null);
    private transient int size = 0;

    public LinketList() {
    heder.next = heder.prev = heder;
    }

    public E gett(int index) {
        return entry(index).element;
        }

    public E getFirstt() {
        if(size == 0)
            throw new NoSuchElementException();

        return (E) heder.next.element;
    }

    public int sizee() {
        return size;
    }

    public E getLest() {
        if(size == 0)
            throw new NoSuchElementException();
        return (E) heder.prev.element;
    }

    public E removeFirstt() {return (E) removee(heder.next);
    }

    public E removeLest() {
        return (E) removee(heder.prev);
    }

    public void addFirstt(E element) {
        addBeforee(element, heder.next);

    }

    public boolean addd(int index, E element) {
        addBeforee(element,(index==size? heder: entry(index)));
        return true;
    }

    private E removee(Entry<E> e) {
        if(e == heder)
            throw new NoSuchElementException();

        E result = e.element;
        e.prev.next = e.next;
        e.next.prev = e.prev;
        e.next = e.prev = null;
        e.element = null;
        return (E) result;
    }

    private Entry <E> addBeforee(E element, Entry<E> entry) {
        Entry newEntry = new Entry(element, entry, entry.prev);
        newEntry.prev.next = newEntry;
        newEntry.next.prev = newEntry;
        size++;
        return newEntry;
    }

    private Entry<E> entry (int index) {
        if(index<0 || index >=size)
            throw new IndexOutOfBoundsException("Index: " + index + ", size = " + size);

        Entry<E> e = heder;
        if (index<(size/2)) {//size>>1
            for(int i = 0; i<=index; i++) {
                e = e.next;
            }
        } else {
            for(int i = size; i>index; i--)
                e = e.prev;
        }
        return e;
    }

    private static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> prev;
        Entry(E element, Entry<E> next, Entry<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
     LinketList listA = new LinketList();

     listA.addd(0, 2);
     listA.addd(1, 7);
     listA.addFirstt(8);
    System.out.println(listA.gett(1));
        System.out.println(listA.getFirstt());
        System.out.println(listA.sizee());
        System.out.println(listA.getLest());
    }
}
