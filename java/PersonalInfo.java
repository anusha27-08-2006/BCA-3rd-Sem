import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PersonalInfo extends JPanel{
@Override
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.BLUE);
g.setFont(new Font("Arial",Font.BOLD,18));
g.drawString("PERSONAL INFORMATION",50,50);
g.setColor(Color.BLACK);
g.setFont(new Font("Arial",Font.PLAIN,14));
g.drawString("Name:John Doe",50,100);
g.drawString("Course:Java Programming",50,130);
g.drawString("Status:Successfully Migrated from Applet!",50,160);
}
public static void main(String[]args){
JFrame frame = new JFrame("Personal information Window");
PersonalInfo panel = new PersonalInfo();
frame.add(panel);
frame.setSize(500,400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}




