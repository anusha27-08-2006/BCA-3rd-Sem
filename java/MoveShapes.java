import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MoveShapes extends JPanel implements KeyListener{
int x = 100,y = 100;
public MoveShapes(){
addKeyListener(this);
setFocusable(true);
setFocusTraversalKeysEnabled(false);
}
@Override
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.red);
g.fillOval(x,y,50,50);
g.setColor(Color.blue);
g.fillRect(x+80,y,60,40);
}
public void keyPressed(KeyEvent e){
int k=e.getKeyCode();
if(k==KeyEvent.VK_LEFT)x-=10;
if(k==KeyEvent.VK_RIGHT)x+=10;
if(k==KeyEvent.VK_UP)y-=10;
if(k==KeyEvent.VK_DOWN)y+=10;
repaint();
}
public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e){}
public static void main(String[] args){
JFrame frame=new JFrame("Move Shapes");
MoveShapes panel=new MoveShapes();
frame.add(panel);
frame.setSize(400, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}