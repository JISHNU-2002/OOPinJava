import java.awt.*;
import java.awt.event.*;
public class MouseAdapterExample extends MouseMotionAdapter {
	Frame f;
	MouseAdapterExample() {
		f=new Frame("Mouse Adapter");
		f.addMouseMotionListener(this);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void mouseDragged(MouseEvent e) {
		Graphics g=f.getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(),10,10);
	}
	public static void main(String[] args) {
		new MouseAdapterExample();
	}
}
