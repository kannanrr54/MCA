import java.util.*;
class mat{
	int a[][]=new int[10][10];
	Scanner s=new Scanner(System.in);
	int[][] get(){
		System.out.println("Enter a 4x4 matrix");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	void display(int a[][]){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
	int[][] add(int a[][],int b[][]){
		int c[][]=new int[10][10];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
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
