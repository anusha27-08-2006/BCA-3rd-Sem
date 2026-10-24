 
class Counter { 
    static int count = 0;  // Static variable shared by all objects 
    int objNumber;         // Instance variable (different for each object) 
 
    Counter() { 
        count++; 
        objNumber = count; 
    } 
 
    void display() { 
        System.out.println("Object number = " + objNumber); 
        System.out.println("Static count = " + count); 
        System.out.println("--------------------"); 
    } 
} 
 
class StaticVariableDemo { 
    public static void main(String[] args) { 
        Counter c1 = new Counter(); 
        Counter c2 = new Counter(); 
        Counter c3 = new Counter(); 
        c1.display(); 
        c2.display(); 
        c3.display(); 
    } 
} 
