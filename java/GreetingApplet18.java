import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GreetingApplet extends JPanel implements KeyListener {
String msg="";
public GreetingApplet(){
setBackground(Color.white);
setFocusable(true);
addKeyListener(this);
}
@Override
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.setFont(new Font("Arial",Font.BOLD,20));
g.setColor(Color.blue);
g.drawString("Press the following keys on the keyboard:",40,60);
g.drawString("M/m-Good Morning",40,90);
g.drawString("A/a-Good Afternoon",40,115);
g.drawString("E/e-Good Evening",40,140);
g.drawString("N/n-Good Night",40,165);
g.setColor(Color.red);
g.drawString(msg,200,235);
}
@Override
public void keyPressed(KeyEvent e){
char ch=e.getKeyChar();
if(ch=='M'||ch=='m')
msg="Good Morning";
else if(ch=='A'||ch=='a')
msg="Good Afternoon";
else if(ch=='E'||ch=='e')
msg="Good Evening";
else if(ch=='N'||ch=='n')
msg="Good Night";
else
msg="Invalid Key!Press M,A,E or N.";
repaint();
}
@Override
public void keyReleased(KeyEvent e){}
@Override
public void keyTyped(KeyEvent e){}
public static void main(String[] args){
JFrame frame=new JFrame("Greeting Window");
GreetingApplet panel=new GreetingApplet();
frame.add(panel);
frame.setSize(600,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
}




