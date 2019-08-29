package surprisequiz.oop.abstraction;

public class AbstractionExecution extends Abstraction {
    @Override
    public void methodA() {
        System.out.println("This is the abstract method from the abstract class");
    }

    public static void main(String[] args) {
        AbstractionExecution abstractionExecution = new AbstractionExecution();
        abstractionExecution.methodA();
        methodB();//static method from inherited Abstraction abstract class, therefore refVar not necessary
        abstractionExecution.methodC();
    }
}
