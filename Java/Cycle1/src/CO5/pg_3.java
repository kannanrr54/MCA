package CO5;
import java.awt.*;
import java.awt.event.*;
public class pg_3{
Label l1=new Label();
Label l2=new Label();
Label l3=new Label();
TextField t4=new TextField();
TextField t5=new TextField();
TextField t6=new TextField();
Button b1=new Button("AVG");
Frame f=new Frame();
	pg_3(){
		l1.setText("S1");
		l1.setBounds(100,100,100,30);
		l2.setText("S2");
		l2.setBounds(100,200,100,30);
		l3.setText("S3");
		l3.setBounds(100,300,100,30);
		
		t4.setBounds(200,100,100,30);
		t5.setBounds(200,200,100,30);
		t6.setBounds(200,300,100,30);
		b1.setBounds(300,400,10,10);
		/*f.add(l1);
		f.add(l2);
		f.add(l3);*/
		f.add(t4);
		f.add(t5);
		f.add(t6);
		//f.add(b1);
		f.setSize(1000,800);
		f.setVisible(true);
		f.setLayout(null);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		});
		
	}
	public static void main(String [] args){
		pg_3 p=new pg_3();
	}
	
}
