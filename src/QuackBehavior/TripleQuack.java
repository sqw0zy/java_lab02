package QuackBehavior;

public class TripleQuack implements QuackBehavior {
    public void quack() {
        QuackBehavior quack = new Quack();
        quack.quack(); quack.quack(); quack.quack();
    }
}
