package CO5;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class tst extends Applet implements ActionListener {
  Label l1 = new Label("MARK 1:");
  Label l2 = new Label("MARK 2:");
  Label l3 = new Label("MARK 3:");
  Label l4 = new Label("Average:");
  TextField t1 = new TextField();
  TextField t2 = new TextField();
  TextField t3 = new TextField();
  TextField t4 = new TextField();
  Button b = new Button("CHECK FACE");
  public void init() {
    l1.setBounds(60, 100, 100, 30);
    l2.setBounds(60, 140, 100, 25);
    l3.setBounds(60, 180, 100, 25);
    l4.setBounds(60, 220, 100, 25);
    t1.setBounds(200, 100, 180, 30);
    t2.setBounds(200, 140, 100, 25);
    t3.setBounds(200, 180, 100, 25);
    t4.setBounds(200, 220, 100, 25);
    b.setBounds(180, 250, 50, 30);
    b.setBackground(Color.pink);
    b.setForeground(Color.blue);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(t1);
    add(t2);
    add(t3);
    add(t4);
    add(b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    int n1 = Integer.parseInt(t2.getText());
    int n2 = Integer.parseInt(t3.getText());
    int n3 = Integer.parseInt(t3.getText());
    if (e.getSource() == b) {
      int avg = (n1 + n2 + n3) / 3;
      t4.setText(String.valueOf(avg));
    }
  }

  public void paint(Graphics g) {
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    int n3 = Integer.parseInt(t3.getText());
    int avg = (n1 + n2 + n3) / 3;
    if (avg > 50) {
      g.setColor(Color.YELLOW);
      g.fillOval(10, 10, 200, 200);
      // draw Eyes
      g.setColor(Color.BLACK);
      g.fillOval(55, 65, 30, 30);
      g.fillOval(135, 65, 30, 30);
      // draw Mouth
      g.fillOval(50, 110, 120, 60);
      // adding smile
      g.setColor(Color.YELLOW);
      g.fillRect(50, 110, 120, 30);
      g.fillOval(50, 120, 120, 40);
    } else {
      g.setColor(Color.yellow);
      g.fillOval(0, 0, 300, 300);
      g.setColor(Color.black);
      g.fillOval(80, 75, 30, 30); //sad face
      g.fillOval(190, 75, 30, 30);
      g.setColor(Color.black);
      g.drawArc(75, 150, 150, 150, 0, 180);
      g.fillArc(75, 150, 150, 150, 0, 180);
    }
  }
}