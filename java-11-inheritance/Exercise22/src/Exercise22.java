/**
 * Expected Output:
 * FIRST
 * SECOND
 * FIRST
 * ANOTHER METHOD
 */
abstract class A {
    abstract void firstMethod();

    void secondMethod() {
        System.out.println("SECOND");

        firstMethod();
    }

    abstract void thirdMethod();
}

abstract class B extends A {
    @Override
    void firstMethod() {
        System.out.println("FIRST");

    }
}

// Implement Class C to generate expected output
class C extends A {

    void firstMethod(){
        System.out.println("FIRST");
    }

    void secondMethod(){
        System.out.println("SECOND");
    }
    void anotherMethod() {
        System.out.println("ANOTHER METHOD");
    }
}

class Exercise22 {
    public static void main(String[] args) {
        C c = new C();
        c.firstMethod();
        c.secondMethod();
        c.firstMethod();
        c.anotherMethod();

    }

}