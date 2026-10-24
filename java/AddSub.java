class AddSub { 
    int a, b; 
 
    void add(int x, int y) { 
        a = x; 
        b = y; 
        System.out.println("Addition = " + (a + b)); 
    } 
    void sub(int x, int y) { 
        a = x; 
        b = y; 
        System.out.println("Subtraction = " + (a - b)); 
    } 
} 
 
class MulDiv extends AddSub { 
    void mul(int x, int y) { 
        a = x; 
        b = y; 
        System.out.println("Multiplication = " + (a * b)); 
    } 
    void div(int x, int y) { 
        a = x; 
        b = y; 
        System.out.println("Division = " + (a / b)); 
    } 
} 
