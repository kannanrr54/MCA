package ExamStudy;

import java.util.*;
class produce extends Thread{
	List<Integer> l;
	int i;
	produce(List<Integer> l){
		this.l=l;
	}
	public void run(){
		while(true){
			prod(i++);
			if(i==10)
				break;
		}
	}
	public void prod(int i){
		synchronized(l){
			if(l.size()==5){
				System.out.println("-----Full------");
				try {
					l.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized(l){
			System.out.println("Produced : "+i);
			l.add(i);
			l.notify();
		}
		
	}
}
class consume extends Thread{
	List<Integer> l;
	int i;
	consume(List<Integer> l){
		this.l=l;
	}
	public void run(){
		while(true)
			cons();
	}
	public void cons(){
		synchronized(l){
			if(l.isEmpty()){
				System.out.println("-----Consumed------");
				l.notify();
				try {
					l.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized(l){
			System.out.println("Consumed : "+l.remove(0));
		}
	}
	
}
public class p2 {
	public static void main(String [] args){
		List<Integer> l=new LinkedList<>();
		produce p=new produce(l);
		consume c=new consume(l);
		p.start();
		c.start();
	}
}
