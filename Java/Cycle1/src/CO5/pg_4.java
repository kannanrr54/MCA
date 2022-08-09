package CO5;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class pg_4 extends Applet implements ActionListener {
	TextField ta=new TextField();
	TextField tb=new TextField();
	TextField tc=new TextField();
	Label la=new Label("1");
	Label lb=new Label("2");
	Label lc=new Label("3");
	Label ld=new Label("Average : ");
	Button b0=new Button("AVG");
	int avg,i=0;
	public void init(){
		ta.setBounds(100,100,100,20);
		tb.setBounds(100,200,100,20);
		tc.setBounds(100,300,100,20);
		la.setBounds(230,100,50,20);
		lb.setBounds(230,200,50,20);
		lc.setBounds(230,300,50,20);
		ld.setBounds(100,500,70,20);
		b0.setBounds(300,200,50,50);
		add(ta);
		add(tb);
		add(tc);
		add(la);
		add(lb);
		add(lc);
		add(ld);
		add(b0);
		b0.addActionListener(this);
			}
public void actionPerformed(ActionEvent e) {
	int a=Integer.parseInt(ta.getText());
	int b=Integer.parseInt(tb.getText());
	int c=Integer.parseInt(tc.getText());
	i=1;
	double avg=(a+b+c)/3;
	if(e.getSource().equals(b0))
		ld.setText("Average : "+avg);
}
public void paint(Graphics g){
	if(i==1){
	int a=Integer.parseInt(ta.getText());
	int b=Integer.parseInt(tb.getText());
	int c=Integer.parseInt(tc.getText());
	avg=(a+b+c)/3;
	if(avg>10){
		g.setColor(Color.yellow);
		g.fillOval(700, 350, 300, 300);
		g.setColor(Color.black);
		g.fillOval(750, 430, 50, 50);
		g.fillOval(900, 430, 50, 50);
		g.fillArc(750, 400, 200, 200, 180, 180);}
	else{
		g.setColor(Color.yellow);
		g.fillOval(700, 350, 300, 300);
		g.setColor(Color.black);
		g.fillOval(750, 430, 50, 50);
		g.fillOval(900, 430, 50, 50);
		g.fillArc(770, 500, 150, 150, 0, 180);
	}
	}
}

}
