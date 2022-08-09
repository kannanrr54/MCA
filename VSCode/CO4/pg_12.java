package CO4;

import java.util.ArrayList;
import java.util.Stack;
class remove{
    
    ArrayList a =new ArrayList<>();
    remove(ArrayList a){
        this.a=a;
    }
    ArrayList removeindex(int x){
        a.remove(x);
        return a;
    }
public class pg_12 {
    }
    public static void main(String[] args) {
        ArrayList a =new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        remove r=new remove(a);
        System.out.println("Removing element at index : 1 -> "+r.removeindex(1));

    }
}
