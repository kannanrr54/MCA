package CO4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class pg_13 {
    public static void main(String[] args) {
        PriorityQueue<String> p =new PriorityQueue<>();
        p.add("A");
        p.add("B");
        p.add("C");
        p.add("D");
        p.add("E");
        
        Iterator i=p.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Top element : "+p.peek());
        System.out.println("Polling Queue : "+p.poll());
        System.out.println("Queue after poll : "+p);
    }
}
