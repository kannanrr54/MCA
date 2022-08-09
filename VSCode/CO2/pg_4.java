package CO2;
import java.util.Scanner;

class employee{
	int eNo;
	String eName;
	Double eSalary;
	employee(int a,String b,Double c){
		eNo=a;
		eName=b;
		eSalary=c;
	}
}
public class pg_4 {
	public static void main(String [] args) {
		int i=0,f=0;
		employee o[]=new employee[10];
		System .out.println("Enter the number of employees");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<n) {
			System .out.println("Enter employee id");
			int a=s.nextInt();
			System .out.println("Enter employee name");
			s.nextLine();
			String b=s.nextLine();
			System .out.println("Enter employee salary");
			Double c=s.nextDouble();
			o[i]=new employee(a,b,c);
			i++;
		}
		System .out.println("Enter employee id to search details");
		int a=s.nextInt();
		i=0;
		while(i<n) {
			if(o[i].eNo==a) {
				System .out.println("Employee Found ");
				System .out.println("eNo : "+o[i].eNo+"\neName : "+o[i].eName+"\neSalary : "+o[i].eSalary);
				f=1;
			}
			i++;
		}
		if(f==0) {
			System .out.println("Employee Not Found");
		}
	}
}
