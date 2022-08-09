package CO4;
class Fib implements Runnable{
	int a=0,b=1,c;
	public void run(){
		System.out.println(a+"\n"+b);
		for (int i=0;i<12;i++){
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
class Ev implements Runnable{
	public void run()
	{
		for (int i=0;i<12;i++){
			if(i%2==0){
				System.out.println("Even - "+i);
			}
		}
	}
}
public class pg_6 {
	public static void main(String [] args){
		Fib f=new Fib();
		Thread t=new Thread(f);
		t.start();
		Ev e=new Ev();
		Thread t1=new Thread(e);
		t1.start();
	}
}
