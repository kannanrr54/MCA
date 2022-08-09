package CO4;

import java.util.HashSet;
import java.util.Iterator;

public class pg_16 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("A");
        h.add("B");
        h.add("B");
        HashSet<String> h1=new HashSet<>();
        h1.add("A");
        h1.add("B");
        h1.add("C");
        Iterator i1=h.iterator();
        Iterator i2=h1.iterator();
        while(i1.hasNext() && i2.hasNext()){
            System.out.println(i1.next().equals(i2.next()));
        }

    }
}
