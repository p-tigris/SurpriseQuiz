package surprisequiz.oop.polymorphism;

public class Animal {

    public void sound() {
        System.out.println("The animal makes a sound");
    }

    public void move() {
        System.out.println("The animal can move");
    }

    //Method overloading
    public void move(int legs) {
        System.out.println("The animal moves with "+legs+" legs");
    }

    public void reproduce() {
        System.out.println("The animal can have children");
    }
}
