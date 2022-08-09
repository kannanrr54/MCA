package CO4;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class pg_15 {
    public static void main(String[] args) {
        HashSet<String> l=new HashSet<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println("Linked Hashset : "+l);
        l.remove("A");
        System.out.println("Removed element A : "+l);
}
}
