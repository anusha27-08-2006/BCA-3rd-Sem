import java.util.Scanner;  
public class Firstyear  
{  
public String cname;  
public String sname;  
public int rollno;  
public int m1, m2, m3, total;  
 
public Firstyear() // Constructor without any parameters..  
{  
cname = "BCA"; m1 = m2 = m3 = total = 0;  
}  
 
public Firstyear(String cname) // Constructor overloading..  
{  
this.cname = cname;  
m1 = m2 = m3 = total = 0;  
}  
 
public void setStudent()  
{  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter student details: name, roll no, m1, m2, m3:");  
sname = sc.next();  
rollno = sc.nextInt();  
m1 = sc.nextInt();  
m2 = sc.nextInt();  
m3 = sc.nextInt();  
total = m1 + m2 + m3;  
}  
 
public void display()  
{  
System.out.println(cname + "\t" + rollno + "\t" + sname + "\t" + m1 + "\t" + m2 + "\t" + m3 
+ "\t" + total);  
}  
