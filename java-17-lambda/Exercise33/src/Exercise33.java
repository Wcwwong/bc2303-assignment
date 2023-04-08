/**
 * Exercise: 
 * Use Lambda expression to implement FunctionalInterface1 and FunctionalInterface2.
 * Call operate method to perform the operations and generate expected output.
 */
/**
 * Expected Output:
 * FunctionalInterface1: Addition is 9
 * FunctionalInterface1: Multiplication is 18
 * FunctionalInterface2: I'm learning Lambda Expression
 * FunctionalInterface2: Yeah, I can use it now
 */
public class Exercise33 {
    // operation is implemented using lambda expressions
    interface FunctionalInterface1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions above
    interface FunctionalInterface2 {
        void sayMessage(String message);
    }

    // Performs FunctionalInterface1's operation on a and b
    private static int operate(int a, int b, FunctionalInterface1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {

        FunctionalInterface1 addition = (a, b) -> {
            return a + b ;
        };
                // lambda expression for addition for two parameters
        // This expression implements FunctionalInterface1 interface

        FunctionalInterface1 multiplication = (a,b) -> {
             return a * b;
        };

        // lambda expression multiplication for two parameters
        // This expression also implements FunctionalInterface1 interface

        // Creating an object of Test to call operate() method using
        // different implementations using lambda Expressions
        Exercise33 tobj = new Exercise33();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + operate(4, 5, addition));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + operate(2,9, multiplication));

        FunctionalInterface2 lambda1 = message -> System.out.println("I'm learning Lambda Expression");
         lambda1.sayMessage(null);
        FunctionalInterface2 lambda2 = message -> System.out.println("Yeah, I can use it now");
         lambda2.sayMessage(null);
        // lambda expression for single parameter
        // This expression implements FunctionalInterface2 interface
    }
}
