package CO4;
import CO4.Arith.*;
public class pg_2 {
    public static void main(String [] args){
        sum s=new sum();
        sub s1=new sub();
        mul s2=new mul();
        div s3=new div();
        System.out.println("Sum : "+s.s(1,2));
        System.out.println("Sub : "+s1.s(1,2));
        System.out.println("Mul : "+s2.s(1,2));
        System.out.println("Div : "+s3.s(1,2));  
    }
}
