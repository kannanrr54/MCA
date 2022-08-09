package ExamStudy;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class as extends Applet implements ItemListener{
	TextField tf2=new TextField();
	TextField tf1=new TextField();
	Button b1=new Button();
	Frame f=new Frame();
	Choice choice = new Choice();
	int o;
	public void paint(Graphics g){
		if(choice.getSelectedIndex()==1){
			g.drawRect(100,100,100,300);
			
		}
	}
 public void init(){
	 tf1.setBounds(100,100,100,30);
	 tf2.setBounds(100,200,100,30);
	 b1.setBounds(100,300,100,30);
	 //b1.addActionListener(this);
	 add(tf1);
	 add(tf2);
	 add(b1);
	 
	 choice.addItem("Shapes");
	 choice.addItem("RECTANGLE");
	 choice.addItem("SQUARE");
	 choice.addItem("CIRCLE");
	 choice.addItem("TRIANGLE");
	 choice.setBounds(100,400,100,30);
	 add(choice);
	 choice.addItemListener(this);
	 setSize(800,800);
	 setLayout(null);
	 setVisible(true);
 }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			int a=Integer.parseInt(tf1.getText());
			tf2.setText(Integer.toString(a+1000));
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		repaint();
		
	}
}
