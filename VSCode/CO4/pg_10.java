package CO4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pg_10 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Kannan");
        a.add("Chinnu");
        a.add("Jes");
        System.out.println("ArrayList : "+a);
        System.out.println("element at index 0 : "+a.get(0));
        a.remove(0);
        System.out.println("after removing element at index 0 : "+a);
        Collections.sort(a);
        System.out.println("ArrayList after sorting: "+a);

    }
}
