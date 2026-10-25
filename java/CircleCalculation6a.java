import java.util.Scanner; 
 
class CircleCalculation { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter radius of the circle: "); 
        double radius = sc.nextDouble(); 
 
        double area = 3.14 * radius * radius; 
        double circumference = 2 * 3.14 * radius; 
 
        System.out.println("Area of Circle = " + area); 
        System.out.println("Circumference of Circle = " + circumference); 
    } 
} 
