package CO5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class er implements ActionListener{
	Frame s=new Frame();
	TextField a=new TextField();
	TextField b=new TextField();
	TextField c=new TextField();
	Button d=new Button("+");
	
	
	er(){
		a.setBounds(100,100,100,50);
		b.setBounds(100,150,100,50);
		c.setBounds(200,100,100,50);
		d.setBounds(20,20,50,50);
		/*s.add(a);
		s.add(b);
		s.add(c);*/
		s.add(d);
		s.setLayout(null);
		s.setSize(500,500);
		s.setVisible(true);
		
		s.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		});
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		public static void main(String [] args){
			er p=new er();
		}

}
