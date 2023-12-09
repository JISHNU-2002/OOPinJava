import java.awt.*;
import java.awt.event.*;
class TLite extends Frame implements ItemListener {
	String clr="";
	TLite () {
			Checkbox c1, c2, c3;
			//CheckboxGroup cpg = new CheckboxGroup();
			c1 = new Checkbox("red",true);			
			c2 = new Checkbox("green", true);
			c3 = new Checkbox("yellow", true);
			setSize(500, 500);
			setTitle("Traffic Signal");
			setVisible(true);
			setLayout(null);
			add(c1);
			add(c2);
			add(c3);
			c1.addItemListener(this);
			c2.addItemListener(this);
			c3.addItemListener(this);
			
	}
	public void itemStateChanged(ItemEvent e) {
        clr = (e.getItem()).toString();
        repaint();
    }
	public static void main(String[] args) {
        new TLite();
    }
}
