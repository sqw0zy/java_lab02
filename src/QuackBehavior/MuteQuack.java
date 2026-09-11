package QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        IO.println("can't quack");
    }
}
