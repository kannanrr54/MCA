package CO5;
import java.awt.*;
import java.awt.event.*;
public class pg_2 implements ActionListener{
	TextField t1,t2,t3;
	Frame f;
	Label l1,l2,l3,l4;
	Button b1;
	pg_2(){
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		f=new Frame();
		l1=new Label();
		l2=new Label();
		l3=new Label();
		l4=new Label("Result : ");
		l1.setText("First num");
		l1.setBounds(100,50,100,40);
		l2.setText("Second num");
		l2.setBounds(300,50,100,40);
		l3.setText("Third num");
		l3.setBounds(500,50,100,40);
		l4.setBounds(300,500,100,40);
		
		t1.setBounds(100,100,100,40);
		t2.setBounds(300,100,100,40);
		t3.setBounds(500,100,100,40);
		
		b1=new Button("Compare");
		b1.setBounds(300,300,100,100);
		b1.addActionListener(this);
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(l4);
		f.add(b1);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=Integer.parseInt(t3.getText());
		if(e.getSource().equals(b1)){
		if(a>b && a>c){
			l4.setText("Large is : "+a);}
		else if(b>a && b>c){
			l4.setText("Large is : "+b);}
		else{
			l4.setText("Large is : "+c);}
		}
	}
	public static void main(String [] args){
		pg_2 p=new pg_2();	
	}

}
