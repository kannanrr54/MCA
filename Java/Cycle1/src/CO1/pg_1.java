package CO1;
import java.util.*;
class p{
	String pcode,pname;
	float price;
	Scanner s=new Scanner(System.in);
	p(){
		System.out.println("Enter Product name");
		pname=s.nextLine();
		System.out.println("Enter Product code");
		pcode=s.nextLine();
		System.out.println("Enter Product price");
		price=s.nextFloat();
	}
}
public class pg_1 {
	
	public static void main(String [] args){
		
		int i=0;
		p o[ ]= new p[3];
		while(i<3){
			p obj=new p();
			o[i]=obj;
			i++;
		}
		if(o[0].price<o[1].price && o[0].price<o[2].price){
			System.out.println("Product "+o[0].pname+" has lowest price  : "+o[0].price);
		}
		else if(o[1].price<o[0].price && o[1].price<o[2].price){
			System.out.println("Product "+o[1].pname+" has lowest price  : "+o[1].price);
		}
		else{
			System.out.println("Product "+o[2].pname+" has lowest price  : "+o[2].price);
		}
	}
}
