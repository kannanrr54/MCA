import java.util.Scanner;
public class Product {
	String pname;
	int pcode;
	float price;
		public void display()
		{
			System.out.println(pname);
			System.out.println(pcode);
			System.out.println(price);
		}


	public  void input() {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the pname of product1:");
		 String pname=s1.nextLine();
		System.out.println("enter the pcode of product1:");
		int pcode=s1.nextInt();
		System.out.println("enter the price of product1:");
		float price=s1.nextInt();
		}
	public static void main(String[] args)
	{
		Product obj1=new Product();
		obj1.input();
		/*Product obj2=new Product();
		obj2.input();
		Product obj3=new Product();
		obj3.input();*/
		System.out.println(obj1);
		obj1.display();
		/*System.out.println(obj2);
		obj2.display();
		System.out.println(obj3);
		obj3.display();*/
		/*
		if(obj1.price > obj2.price && obj1.price > obj3.price)
		{
			System.out.println("price of obj1 is more");
		}
		else if(obj2.price > obj3.price)
		{
			System.out.println("price of obj2 is more");
		}
		else
		{
			System.out.println("price of obj3 is more");
		}*/
		
		
	}
	
}