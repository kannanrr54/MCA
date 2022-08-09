package ExamStudy;
interface x{
	int a=10;
	int sum(int a,int b);
}
interface y{
	int b=0;
	int sub(int a,int b);
}
class f implements x,y{

	@Override
	public int sub(int a, int b) {
		return(a+b);
	}

	@Override
	public int sum(int a, int b) {
		return(a+b);
		
	}
	
}
public class b {

}
