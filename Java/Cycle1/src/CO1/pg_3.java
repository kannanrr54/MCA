package CO1;
import java.util.Scanner;

class complex{
	void add(String s1,String s2){
	int a1=Integer.parseInt((s1.split("\\+"))[0]);
	int b1=Integer.parseInt((s1.split("\\+")[1]).split("i")[0]);
	int a2=Integer.parseInt((s2.split("\\+"))[0]);
	int b2=Integer.parseInt((s2.split("\\+")[1]).split("i")[0]);
	System.out.println("Sum is = "+(a1+a2)+"+"+(b1+b2+"i"));
	}
}
public class pg_3 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		 complex c=new complex();
		 System.out.println("Enter a complex number");
		 String s1=s.nextLine();
		 System.out.println("Enter a complex number");
		 String s2=s.nextLine();
		 c.add(s1,s2);
	}
}
