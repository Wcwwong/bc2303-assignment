enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar){
            case HIGH:{
              System.out.println("This is High level");
              System.out.println("enum is HIGH, and its value is 3");
              break;
            }
            case MEDIUM:{
              System.out.println("This is Medium level");
              System.out.println("enum is MEDIUM, and its value is 2");
              break;
            }
            case LOW:{
                System.out.println("This is Low level");
                System.out.println("enum is LOW, and its value is 1");
        }
        // Write a switch statement to print the expected output.

    }

    }
}