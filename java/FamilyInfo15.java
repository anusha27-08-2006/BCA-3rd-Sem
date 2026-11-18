import java.awt.*;
import java.awt.event.*;
class FamilyInfo extends Frame implements ActionListener {
Button father,mother;
Label details;
FamilyInfo(){
setLayout(new FlowLayout());
father = new Button("Father");
mother = new Button("Mother");
details = new Label("Click a button to see details.");
add(father);
add(mother);
add(details);
father.addActionListener(this);
mother.addActionListener(this);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
});
setSize(300,150);
setTitle("Family Details");
setVisible(true);
}
public void actionPerformed(ActionEvent e){
if (e.getSource()==father)
details.setText("Father:Rajesh|Age:45|Job:Engineer");
else if (e.getSource()==mother)
details.setText("Mother:Meena|Age:40|Job:Teacher");
}
public static void main(String args[]){
new FamilyInfo();
}
}


