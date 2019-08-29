package surprisequiz.oop.polymorphism;

public class Cat extends Animal {

    //Method overriding
    @Override
    public void sound() {
        super.sound();//Method from Animal class
        System.out.println("The cat says meow");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("The cat moves with four legs");
    }

    @Override
    public void reproduce() {
        super.reproduce();
        System.out.println("The cat has live babies");
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
        cat.move();
        cat.move(4);
        cat.reproduce();


    }
}
