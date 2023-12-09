import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener{
  static double a, b, result;
  static int operator;
  String s0, s1, s2;
  JFrame f;
  JTextField tf;
  JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bmul, bsub, badd, bdiv, bdec, beq, clear;
  A(){
    f = new JFrame("Calculator");

    b0 = new JButton("0");b1 = new JButton("1");
    b2 = new JButton("2");b3 = new JButton("3");
    b4 = new JButton("4");b5 = new JButton("5");
    b6 = new JButton("6");b7 = new JButton("7");
    b8 = new JButton("8");b9 = new JButton("9");
    bmul = new JButton("*");bsub = new JButton("-");
    badd = new JButton("+");bdiv = new JButton("/");
    bdec = new JButton(".");beq = new JButton("=");
    clear = new JButton("C");

    tf = new JTextField(16);

    JPanel p = new JPanel();

    b0.addActionListener(this);b1.addActionListener(this);b2.addActionListener(this);
    b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
    b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);bmul.addActionListener(this);
    bsub.addActionListener(this);badd.addActionListener(this);clear.addActionListener(this);
    bdiv.addActionListener(this);bdec.addActionListener(this);beq.addActionListener(this);

    p.add(tf);p.add(b0);p.add(b1);
    p.add(b2);p.add(b3);p.add(b4);
    p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
    p.add(badd);p.add(bsub);p.add(bmul);p.add(bdiv);
    p.add(bdec);p.add(beq);p.add(clear);

    f.add(p);
    f.setVisible(true);
    f.setSize(200,250);
  }
  public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1)
		tf.setText(tf.getText().concat("1"));
	if(e.getSource()==b2)
		tf.setText(tf.getText().concat("2"));
	if(e.getSource()==b3)
		tf.setText(tf.getText().concat("3"));
	if(e.getSource()==b4)
		tf.setText(tf.getText().concat("4"));
	if(e.getSource()==b5)
		tf.setText(tf.getText().concat("5"));
	if(e.getSource()==b6)
		tf.setText(tf.getText().concat("6"));
	if(e.getSource()==b7)
		tf.setText(tf.getText().concat("7"));
	if(e.getSource()==b8)
		tf.setText(tf.getText().concat("8"));
	if(e.getSource()==b9)
		tf.setText(tf.getText().concat("9"));
	if(e.getSource()==b0)
		tf.setText(tf.getText().concat("0"));
	if(e.getSource()==bdec)
		tf.setText(tf.getText().concat("."));
	if(e.getSource()==badd){
		a=Double.parseDouble(tf.getText());
		operator=1;
		tf.setText("");
	}
	if(e.getSource()==bsub){
		a=Double.parseDouble(tf.getText());
		operator=2;
		tf.setText("");
	}
	if(e.getSource()==bmul){
		a=Double.parseDouble(tf.getText());
		operator=3;
		tf.setText("");
	}
	if(e.getSource()==bdiv){
		a=Double.parseDouble(tf.getText());
		operator=4;
		tf.setText("");
	}
	if(e.getSource()==beq){
		b=Double.parseDouble(tf.getText());
		switch(operator){
			case 1: result=a+b;
				break;
			case 2: result=a-b;
				break;
			case 3: result=a*b;
				break;
			case 4: result=a/b;
				break;
			default: result=0;
		}
		tf.setText(""+result);
	}
	if(e.getSource()==clear)
		tf.setText("");
	if(e.getSource()==bdec){
		String s=tf.getText();
		tf.setText("");
		for(int i=0;i<s.length()-1;i++)
			tf.setText(tf.getText()+s.charAt(i));
	}
}}
 
class calcu{
	public static void main(String args[]) {
    	new A();
}}
