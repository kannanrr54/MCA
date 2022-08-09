package CO4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class pg_14 {
    public static void main(String[] args) {
        Deque<String> d=new ArrayDeque<String>();
        d.add("A");
        d.add("B");
        Iterator i=d.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Iterator id=d.descendingIterator();
        System.out.println("Descending order");
        while(id.hasNext()){
            System.out.println(id.next());
        }
        d.addFirst("X");
        d.addLast("Z");
        System.out.println("After adding : "+d);
        System.out.println("Removing First : "+d.removeFirst());
        System.out.println("Removing Last : "+d.removeLast());
        System.out.println("pop : "+d.pop());
        System.out.println("poll : "+d.poll());
    }
}
