package CO1;
import java.util.*;
class mat{
	int a[][]=new int[10][10];
	int r,c;
	Scanner s=new Scanner(System.in);
	int[][] get(){
		System.out.println("Enter number of columns");
		r=s.nextInt();
		System.out.println("Enter number of rows");
		c=s.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	void display(int a[][]){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
	int[][] add(int a[][],int b[][]){
		int c1[][]=new int[10][10];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				c1[i][j]=a[i][j]+b[i][j];
			}
		}
		return c1;
	}

}
public class pg_2 {
	public static void main(String [] args){
		mat m1 =new mat();
		int a[][] = m1.get();
		mat m2 =new mat();
		int b[][] = m2.get();
		System.out.println("Sum is");
		int c[][]=m1.add(a, b);
		m1.display(c);
		
	}
}
