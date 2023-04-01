/**
 * Expected Output:
 * Static methods can be called without creating objects
 * Public methods must be called by creating objects
 */
public class Exercise14 {
    // Static method
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // instance method
    public void anotherMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myMethod();// 1. Static method
        System.out.println(myMethod()); // Call the static method

        anotherMethod(); // 2. Instance Method
        // myPublicMethod(); This would compile an error, why?

        // Create an object of Exercise14
        // Call the public method on the object
    }
}
