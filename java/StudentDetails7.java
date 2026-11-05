import java.util.Scanner; 
class Student { 
    int eno; 
    String name; 
    int m1, m2, m3, total; 
    Student(int no, String n, int s1, int s2, int s3) { 
        eno = no; 
        name = n; 
        m1 = s1; 
        m2 = s2; 
        m3 = s3; 
        if (m1 >= 50 && m2 >= 50 && m3 >= 50) 
            total = m1 + m2 + m3; 
        else 
            total = 0; 
    } 
} 
class StudentDetails { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Student s[] = new Student[3]; 
 
        for (int i = 0; i < 3; i++) { 
            System.out.println("\nEnter details for Student " + (i + 1)); 
            System.out.print("Enrollment No: "); 
            int eno = sc.nextInt(); 
            System.out.print("Name: "); 
            String name = sc.next(); 
            System.out.print("Mark 1: "); 
            int m1 = sc.nextInt(); 
            System.out.print("Mark 2: "); 
            int m2 = sc.nextInt(); 
            System.out.print("Mark 3: "); 
            int m3 = sc.nextInt(); 
            s[i] = new Student(eno, name, m1, m2, m3)
