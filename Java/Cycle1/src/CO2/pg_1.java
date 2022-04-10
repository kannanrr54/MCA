package CO2;
import java.util.*;
public class pg_1 {
public static void main(String [] args) {
	String k,t;
	String a[] = new String[10];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a sentence");
	k=s.nextLine();
	a=k.split(" ");
	for (int i=0;i<a.length;i++) 
		for (int j=i+1;j<a.length;j++) 
			if(a[i].compareTo(a[j])>0) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
	System.out.println("Sorted Order : ");
	for (int i=0;i<a.length;i++) 
		System.out.println(a[i]);	
}
}
