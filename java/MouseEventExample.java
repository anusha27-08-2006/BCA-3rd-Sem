import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class MouseEventExample extends JFrame implements MouseListener{
String msg="";
public MouseEventExample(){
setTitle("Mouse Event Example");
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
addMouseListener(this);
setVisible(true);
}
public void mouseClicked(MouseEvent e){
msg="Mouse Clicked";
repaint();
}
public void mousePressed(MouseEvent e){
msg="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent e){
msg="Mouse Released";
repaint();
}
public void mouseEntered(MouseEvent e){
msg="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent e){
msg="Mouse Exited";
repaint();
}
public void paint(Graphics g){
super.paint(g);
g.setFont(new Font("Arial",Font.BOLD,18));
g.drawString(msg,100,100);
}
public static void main(String[] args){
new MouseEventExample();
}
}