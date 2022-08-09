package CO2;
import java.util.*;
public class pg_2 {
public static void main(String [] args){
	int[] a=new int[10];
	int b=0,k=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of elements");
	k=s.nextInt();
	System.out.println("Enter the elements");
	for (int i=0;i<k;i++){
		a[i]=s.nextInt();
	}
	System.out.println("Enter the number to search");
	int x=s.nextInt();
	for (int i=0;i<k;i++){
		if(a[i]==x) {
			System.out.println("Number found");
			b=1;
			break;
		}	
	}
	if(b==0)
		System.out.println("Number not found");
}
}
