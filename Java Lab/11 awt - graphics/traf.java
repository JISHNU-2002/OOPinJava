import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class Trafficlight extends JPanel implements ActionListener{
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	Color redc,yellowc,greenc;
	Trafficlight(){
	setBounds(0,0,200,200);
	r1=new JRadioButton("Red");
	r2=new JRadioButton("yellow");
	r3=new JRadioButton("green");
	add(r1);
	add(r2);
	add(r3);
	ButtonGroup btn=new ButtonGroup();
	btn.add(r1); 
	btn.add(r2); 
	btn.add(r3); 
	setVisible(true);
	r1.setSelected(true);
			redc=Color.red;
		yellowc=getBackground();
		greenc=getBackground();

	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	
}
public void actionPerformed(ActionEvent e){
	if(r1.isSelected()==true){
		redc=Color.red;
		yellowc=getBackground();
		greenc=getBackground();
	}
	else if(r2.isSelected()==true){
		redc=getBackground();
		yellowc=Color.yellow;
		greenc=getBackground();
	}
	else if(r3.isSelected()==true){
		redc=getBackground();
		yellowc=getBackground();
		greenc=Color.green;
	}
	repaint();
	
	
	
	}
public void paintComponent(Graphics g){
g.drawOval(200,40,30,30);
g.drawOval(200,80,30,30);
g.drawOval(200,120,30,30);

g.setColor(redc);
g.fillOval(200,40,30,30);
g.setColor(yellowc);
g.fillOval(200,80,30,30);
g.setColor(greenc);
g.fillOval(200,120,30,30);
}
}
 class traf {
	 public static void main(String args[]){
		 JFrame f=new JFrame("traffic");
		 f.setVisible(true);
		 f.setSize(400,400);
		 Trafficlight tr=new Trafficlight();
		 f.add(tr);
}}
