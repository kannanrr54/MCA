package ExamStudy;
class p{
	int a;
	p(int a){
		this.a=a;
	}
}
class e extends p{
	int b;
	e(int a,int b){
		super(a);
		this.b=b;
	}
}
class t extends e{
	int c;
	t(int a,int b,int c){
		super(a,b);
		this.c=c;
	}
}
public class a {
public static void main(String [] args){
	t t1=new t(1,1,2);
	System.out.println(t1.a);
}
}
