package CO4;
import java.util.ArrayList;

class stack <T>{    
    ArrayList<T> s;
    int top=-1,limit;
    stack(int n){
        this.limit=n;
        s=new ArrayList<>(limit);
    }
    void display(){
        for (int i=0;i<top+1;i++){
            System.out.println(s.get(i));
        }
    }
    void pop(){
        if(top!=0){
            System.out.println("pop element : "+s.get(top));
            top--;
        }
    }
    void push(T a){
        if(top<s.size()){
            System.out.println("element pushed");
            top++;
            s.add(a);
        }
    }
}
public class pg_8 {
    public static void main(String[] args) {
        stack<Integer> s=new stack(3);
        s.push(12);
        s.push(13);
        s.push(14);
        s.display();
        s.pop();
        s.display();
    }
}
