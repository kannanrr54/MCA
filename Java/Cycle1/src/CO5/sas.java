package CO5;

import java.awt.*;
import java.awt.event.*;
class sas implements ActionListener
{
Frame f=new Frame();
Button b=new Button();
sas()
{
b.setBounds(100,100,50,20);
f.add(b);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,450);
f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
});
}
public void actionPerformed(ActionEvent e)
{
}
public static void main(String args[])
{
new sas();
}}