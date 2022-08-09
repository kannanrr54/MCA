package CO4;

import java.util.LinkedList;

public class pg_11 {
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        System.out.println("Linked list : "+s);
        s.clear();
        System.out.println("Linked list after removing: "+s);
    }
}
