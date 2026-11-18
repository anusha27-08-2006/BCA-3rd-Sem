import java.awt.*;
import java.awt.event.*;
class MenuExample extends Frame implements ActionListener{
MenuExample(){
MenuBar mb=new MenuBar();
Menu file=new Menu("File");
Menu edit=new Menu("Edit");
MenuItem open=new MenuItem("Open");
MenuItem save=new MenuItem("Save");
MenuItem exit=new MenuItem("Exit");
MenuItem cut=new MenuItem("Cut");
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
file.add(open);
file.add(save);
file.add(exit);
edit.add(cut);
edit.add(copy);
edit.add(paste);
mb.add(file);
mb.add(edit);
exit.addActionListener(this);
setMenuBar(mb);
setTitle("Simple Menu Example");
setSize(400,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
System.exit(0);
}
public static void main(String[] args){
new MenuExample();
}
}






