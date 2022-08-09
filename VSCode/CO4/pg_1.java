package CO4;

import CO4.graphics.*;
public class pg_1 {
	public static void main(String [] args){
		circle c=new circle();
		rectangle r=new rectangle();
		Square s=new Square();
		Triangle t=new Triangle();
		System.out.println("Area of Circle : "+c.CalcArea(10));
		System.out.println("Area of rectangle : "+r.CalcArea(10,20));
		System.out.println("Area of Square : "+s.CalcArea(10));
		System.out.println("Area of Triangle : "+t.CalcArea(10,20));
	}
}
