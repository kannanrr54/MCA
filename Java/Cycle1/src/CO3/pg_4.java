package CO3;
class publisher{
	String pname;
	publisher(String pname){
		this.pname=pname;
	}
}
class book extends publisher{
	String bname;
	book(String pname,String bname) {
		super(pname);
	}
}
class Literature extends publisher{
String author;
	Literature(String pname,String author) {
		super(pname,bname);
		this.author=author;
	}
	void disp(){
		System.out.println("Genere - Literature\nBook Name - "+bname);
	}
}
class Fiction extends publisher{
String author;
	Fiction(String pname,String author) {
		super(pname);
		this.author=author;
	}
}
public class pg_4 {

}
