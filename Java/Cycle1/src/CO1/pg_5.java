package CO1;
class cpu{
	int price=0;
	//nested class
	class processor{
		int cores;
		String manufacturer;
		processor(int x,String s){
			cores=x;
			manufacturer=s;
		}
		void display(){
			System.out.println("Cores - "+cores+"\n"+"Manufacturer - "+manufacturer);
		}
	}
	static class ram{
		int mem;
		String manufacturer;
		ram(int x,String s){
			mem=x;
			manufacturer=s;
		}
		void display(){
			System.out.println("Memory - "+mem+"\n"+"Ram Manufacturer - "+manufacturer);
		}
	}
}
public class pg_5 {
	public static void main(String [] args){
		cpu c=new cpu();
		cpu.processor p= c.new processor(2,"AMD");
		cpu.ram r=new cpu.ram(4, "Crucial");
		p.display();
		r.display();
		System.out.println();
	}
}
