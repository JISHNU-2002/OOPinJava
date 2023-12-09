import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Build extends JFrame implements ActionListener{
	JFrame aw;
	JPanel rp,bp,ip;
	JTextField tf;
	JLabel exp,appT;
	JButton plus,minus,into,divide,clear,equals,point,percentage;
	JButton digits[] = new JButton[10];
	char ef;
	double op1=0,op2=0;
	String opr="=";
	Build(){
		Font txtfont = new Font("SansSerif",Font.BOLD,30);
		Font titlefont = new Font("SansSerif",Font.BOLD,20);
		Font expressionfont = new Font("SansSerif",Font.BOLD,15);
		aw = new JFrame("CALCULATOR");
		rp = new JPanel();
		bp = new JPanel();
		ip = new JPanel();
		aw.setLayout(new GridLayout(3,1));
		bp.setLayout(new GridLayout(6,6));
		ip.setLayout(new GridLayout(3,1));
		aw.setResizable(false);
		appT = new JLabel("JISHNU's CALCULATOR");
		appT.setFont(titlefont);
		exp  = new JLabel("Type the expression");
		exp.setFont(expressionfont);
		tf   = new JTextField(15);
		tf.setBorder(null);
		tf.setPreferredSize(new Dimension(15,50));
		tf.setFont(txtfont);
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		
		plus = new JButton("+");
            	plus.addActionListener(this);
            	plus.setBounds(30,10,30,30);
            	minus = new JButton("-");
           	minus.addActionListener(this);
           	minus.setBounds(30,30,30,30);
           	into = new JButton("*");
           	into.addActionListener(this);
           	into.setBounds(30,30,30,30);
           	divide = new JButton("/");
            	divide.addActionListener(this);
            	divide.setBounds(30,30,30,30);
            	percentage = new JButton("%");
            	percentage.addActionListener(this);
            	percentage.setBounds(30,30,30,30);
            	point = new JButton(".");
            	point.addActionListener(this);
            	point.setBounds(30,30,30,30);
            	equals = new JButton("=");
            	equals.addActionListener(this);
            	equals.setBounds(30,30,30,30);
            	clear = new JButton("AC");
            	clear.addActionListener(this);
            	clear.setBounds(30,30,30,30);
            	for(int i=0;i<10;i++){
			digits[i] = new JButton(""+i);
			digits[i].addActionListener(this);
			digits[i].setBounds(30,30,30,30);
		}
            	
            	rp.add(appT);
            	rp.add(tf);
            	rp.add(exp);
            	for(int i=0;i<10;i++){
            		bp.add(digits[i]);
            	}
            	bp.add(plus);
            	bp.add(minus);
            	bp.add(into);
            	bp.add(divide);
            	bp.add(percentage);
		bp.add(point);
		bp.add(equals);
		bp.add(clear);    
		aw.add(rp);
		aw.add(bp);
		aw.add(ip);
		aw.setSize(500,500);
		aw.setVisible(true);
	}  
	public void actionPerformed(ActionEvent e){    
		ef = e.getActionCommand().charAt(0);
		String build;
		if(Character.isDigit(ef)){
                	build = tf.getText() + ef; 
                	tf.setText(build);
            	}else if(e.getActionCommand() == "."){
                	build = tf.getText() + ef; 
                	tf.setText(build);
            	}else if(ef != '='){
               	op1 = Double.parseDouble(tf.getText());
                	opr = e.getActionCommand();
                	exp.setText(op1 + " " + opr);
                	tf.setText("");
            	}else if(e.getActionCommand() == "clear") {
                	tf.setText("");
            	}else{
                	op2 = Double.parseDouble(tf.getText());
                	exp.setText(exp.getText() + " " + op2);
                	switch(opr) {
                    		case "+": tf.setText(""+(op1 + op2)); 
                    			break;
                    		case "-": tf.setText(""+(op1 - op2)); 
                    			break;
                    		case "*": tf.setText(""+(op1 * op2)); 
                    			break;
                    		case "/": try{
                                    		if(op2 == 0)
                                     			throw new ArithmeticException();
                                    			tf.setText(""+(op1 / op2));
                                    			break;
                                    	}catch(ArithmeticException q){
                                    		JOptionPane.showMessageDialog(aw, "MATH ERROR");
                             		}break;
                    		case "%": try{
                    				if(op2 == 0)
                                     			throw new ArithmeticException();
                                    			tf.setText(""+(op1 % op2));
                                    			break;
                                	}catch(ArithmeticException ae2){
                                  		JOptionPane.showMessageDialog(aw, "MATH ERROR");
                             		}break;
                    		default:break;
                	}
            	}
        }	
}
class mycalculator{
	public static void main(String args[]){
	new Build();
}}
