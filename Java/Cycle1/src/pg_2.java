import java.util.*;
class mat{
	int a[][]=new int[10][10];
	//b=new int[10][10];
	//int c[][],a[][],b[][];
	Scanner s=new Scanner(System.in);
	int[] get(){
		System.out.println("Enter a 4x4 matrix");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	void display(){
		System.out.println("Enter a 4x4 matrix");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				//a[i][j]=s.nextInt();
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

}
public class pg_2 {
	public static void main(String [] args){
		mat m1 =new mat();
		m1.get();
		mat m2 =new mat();
		m2.get();
		m.display();
	}
}
