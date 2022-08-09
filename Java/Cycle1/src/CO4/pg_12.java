package CO4;

import java.util.*;
class remove{
    Stack<String> a =new Stack<>();
    remove(Stack a){
        this.a=a;
    }
    Stack removeindex(int x){
        a.remove(x);
        return a;
    }
}
public class pg_12{
    public static void main(String[] args) {
    	Stack a =new Stack<>();
        a.add(1);
        a.add("B");
        a.add("C");
        System.out.println("Stack - "+a);
        System.out.println("Enter position to remove");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        remove r=new remove(a);
        System.out.println("After removing"+r.removeindex(i));

    }
}
