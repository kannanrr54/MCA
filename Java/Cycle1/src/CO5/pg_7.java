package CO5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class pg_7 implements ActionListener{
	TextField tt1=new TextField();
	TextField tt2=new TextField();
	Button bb1=new Button("+");
	Button bb2=new Button("-");
	Frame ff1=new Frame();
	
pg_7(){
	tt1.setBounds(100,100,100,20);
	tt2.setBounds(100,200,100,20);
	bb2.setBounds(100,300,100,20);
	bb2.setBounds(100,400,100,20);
	ff1.add(tt1);
	ff1.add(tt2);
	//ff1.add(bb1);
	//ff1.add(bb2);
	ff1.setSize(800,800);
	ff1.setVisible(true);
	ff1.setLayout(null);
	ff1.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String [] args){
		pg_7 ppp=new pg_7();
	}

}
