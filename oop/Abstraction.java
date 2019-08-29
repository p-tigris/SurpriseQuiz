package surprisequiz.oop;

public abstract class Abstraction implements Interface {
    public abstract void methodA();

    public static void methodB() {
        System.out.println("This is not an abstract method");
    }

    public void methodC(){
        System.out.println("This is also not an abstract method");
    }
}
