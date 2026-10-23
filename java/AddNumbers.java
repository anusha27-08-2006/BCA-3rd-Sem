class AddNumbers { 
 
    // Method to add two integers 
    void add(int a, int b) { 
        int sum = a + b; 
        System.out.println("Sum of integers = " + sum); 
    } 
 
    // Method to add two float numbers 
    void add(float x, float y) { 
        float sum = x + y; 
        System.out.println("Sum of floats = " + sum); 
    } 
 
    // Method with no arguments (default values) 
    void add() { 
        int a = 5, b = 10; 
        int sum = a + b; 
        System.out.println("Default sum (integers) = " + sum); 
    } 
 
    public static void main(String[] args) { 
        AddNumbers obj = new AddNumbers(); 
 
        obj.add();           // No arguments → uses default values 
        obj.add(8, 12);      // Adds two integers 
        obj.add(2.5f, 4.5f); // Adds two floats 
    } 
} 
