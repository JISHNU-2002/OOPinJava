import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener{
String msg="";
int mouseX=0,mouseY=0;//coordinates of Mouse
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}
//Handle mouse clicked
public void mouseClicked(MouseEvent me){//save coordinates
mouseX=0;mouseY=10;
msg="mouse clicked";
repaint();
}
//Handle mouse entered
public void mouseEntered(MouseEvent me){//save coordinates
mouseX=0;mouseY=10;
msg="mouse entered";
repaint();
}


//handle mouse exited
public void mouseExited(MouseEvent me){//save coordinates
mouseX=0;mouseY=10;
msg="mouse exited";
repaint();}
//handle button pressed
public void mousePressed(MouseEvent me){//save coordinates
mouseX=me.getX();mouseY=me.getY();
msg="Down";
repaint();
}
//handle mouse released
public void mouseReleased(MouseEvent me){
mouseX=me.getX();mouseY=me.getY();
msg="up";
repaint();
}
//handle mouse dragged
public void mouseDragged(MouseEvent me){
mouseX=me.getX();mouseY=me.getY();
msg="*";
showStatus("Dragging moue at "+mouseX+"'"+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me){
showStatus("Moving mouse at "+me.getX()+","+me.getY());
}

public void paint(Graphics g){
g.drawString(msg,mouseX,mouseY);}}





