package CO4;
import java.util.ArrayList;
import java.util.List;
class Producer implements Runnable
{
	List<Integer>l;
	int i=0;
	Producer(List<Integer>l1)
	{
		l=l1;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				produce(i++);
				if(i==10)
					break;
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public void produce(int i) throws Exception
	{
		synchronized (l)
		{
			while (l.size()==5)
			{
				System.out.println("Production full");
				l.wait();
			}
		}
		synchronized(l)
		{
			System.out.println("produced:"+i);
			l.add(i);
			l.notify();
		}
	}
}
class Consumer implements Runnable
{
	List<Integer>l;
	Consumer (List<Integer>l1)
	{
	l=l1;
	}
	public void run()
	{
		while(true)
		{
		try
		{
			consume();
		}
		catch (Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
	}
	public void consume() throws Exception
	{
		synchronized(l)
		{
			while(l.isEmpty())
			{
				System.out.println("fully Consumed");
				l.notify();
				Thread.sleep(500);
				l.wait();
			}
	}
		synchronized(l)
		{
			Thread.sleep(1000);
			System.out.println("Consumed"+l.remove(0));
			
		}
	}
	
}

public class pg_7 {

	public static void main(String args[])
	{
	List<Integer>l=new ArrayList<Integer>();
	Producer p=new Producer(l);
	Thread t1=new Thread(p);
	Consumer c=new Consumer(l);
	Thread t2=new Thread(c);
	t1.start();
	t2.start();
	}
	
}