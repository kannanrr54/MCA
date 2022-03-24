class rect{
	int len,bth;
	rect(int l,int b){
		len=l;
		bth=b;
	}
	int area(){
		return len*bth;
	}
	int perimeter(){
		return 2*(len + bth);
	}
}
public class T2 {
	public static void main(String [] args){
		rect r1=new rect(1,2);
		rect r2=new rect(4,3);
		System.out.println("Rectangle 1 \nArea:"+r1.area());
		System.out.println("Perimeter : "+r1.perimeter());
		System.out.println("Rectangle 2 \nArea:"+r2.area());
		System.out.println("Perimeter : "+r2.perimeter());
	}
}
