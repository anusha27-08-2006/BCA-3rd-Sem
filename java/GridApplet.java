import java.awt.*;
import javax.swing.JFrame;
public class GridApplet extends Canvas {
public void paint(Graphics g){
for(int x = 0; x <= 300; x += 50){
g.drawLine(x,0,x,300);
}
for(int y = 0;y <= 300; y += 50){
g.drawLine(0,y,300,y);
}
}
public static void main(String[]args){
JFrame frame = new JFrame("Applet Viewer:GridApplet");
GridApplet canvas = new GridApplet();
frame.setSize(320, 340);
frame.add(canvas);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}