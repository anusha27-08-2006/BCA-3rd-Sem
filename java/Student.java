package student.FulltimeBCA;
import java.util.*;
public class Student{
String name;
int age;
String sex;
public void store(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Name:");
name=sc.nextLine();
System.out.print("Enter Age:");
age=sc.nextInt();
sc.nextLine();
System.out.print("Enter Sex:");
sex=sc.nextLine();
}
public void display(){
System.out.println("\n--Student Details--");
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Sex:"+sex);
}
}
