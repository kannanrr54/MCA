package CO5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pg_6 extends Applet implements MouseListener{
	int a=0;
	public void paint(Graphics g){
		
		if(a==1){
			g.setColor(Color.blue);
			g.fillRect(100,100,200,200);
		}
		else if(a==2)
		{
			g.setColor(Color.black);
			g.fillRect(100,100,200,200);
		}
		else{
			g.setColor(Color.red);
			g.fillRect(100,100,200,200);
		}
	}
	public void init(){
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent arg0) {
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
				a=1;
				repaint();
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		a=2;
		repaint();
		
	}
	

}
