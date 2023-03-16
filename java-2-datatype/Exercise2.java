import javax.swing.event.SwingPropertyChangeSupport;

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";
    String str2 = "ab c";
    int a= 19;
    System.out.println(str.charAt(15));
    System.out.println(str.charAt(1));
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));
    System.out.println(str2);
    System.out.println(str.replace("Java", "Coding"));
    System.out.println(a);
    System.out.println(str.substring(5,8));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.replaceAll("e", "*").toUpperCase().concat("!!!"));




    // Use int name.charAt()
    // prints J
    // prints e

    // Use int indexOf(int ch), or int indexOf(String ch)
    // prints 3
    // prints 9
    // prints 10

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"

    // Use String replace() method
    // prints VenturenixLAB, Coding

    // int length()
    // prints 19

    // Use String substring(int start, int end)
    // prints "ren"

    // String toLowerCase(), and String toUpperCase()
    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"

    // Method Chaining, replaceAll(), toUpperCase(), concat()
    // prints "V*NTUR*NIXLAB, JAVA!!!"
  }

}