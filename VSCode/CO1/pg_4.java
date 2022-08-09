package CO1;

import java.util.Scanner;

class sym{
	int a[][]=new int[10][10];
	int r,c;
	Scanner s=new Scanner(System.in);
	int[][] get(){
		System.out.println("Enter number of columns");
		r=s.nextInt();
		System.out.println("Enter number of rows");
		c=s.nextInt();
		System.out.println("Enter the"+r+" x "+c+"matrix");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=s.nextInt();
		
		return a;
	}
	/*void display(int a[][]){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(" "+a[i][j]);}
			System.out.println("");}
	}*/
	void CheckSym(int a[][]){
		int d=0;
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				if(a[i][j]!=a[j][i])
					d=1;
		if(d==0)
			System.out.println("Matrix is Symemtric");
		else
			System.out.println("Matrix is not Symemtric");
	}

}
public class pg_4 {
	public static void main(String [] args){
		int a[][]=new int[10][10];
		sym s1=new sym();
		a=s1.get();
		//s1.display(a);
		s1.CheckSym(a);
	}
	
}
