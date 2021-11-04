//import java.util.LinkedList;
//import java.util.List;
//
//public class Lists {
//    List<String> list = new LinkedList<String>();
//    Heder heder = new Heder(next, prev);
//
//
//
//    transient int size;
//
//
//    transient Entry<E> next;
//    transient Entry<E>  prev;
//
////    Lists() {
////        heder(heder, heder);
////        size = 0;
//////        this.element = element;
//////        this.next = next;
//////        this.prev = prev;
////    }
//
////
////   public static void add(int element) {
////        Entry newEntry = new Entry(element, heder.prev);
////        newEntry.prev= newEntry;
////        newEntry.next.prev = newEntry;
////        size ++;
////       heder.next = newEntry;
////        heder.prev = newEntry;
////
////    }
//
//
//    private static class Entry<E> {
//        E item;
//        Entry<E> next;
//        Entry<E> prev;
//        Entry(E element, Entry<E> next, Entry<E> prev) {
//            this.item = element;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//    public void class Heder<E> {
//        final E element;
//        Heder<E> next;
//        Heder<E> prev;
//        Heder(Heder<E> next, Heder<E> prev) {
//            this.element = null;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//
//    public static void main(String[] args) {
//        Lists lists = new Lists();
//        System.out.println(lists.size);
//      lists.list.add("0");
//
//
//    }
//}
