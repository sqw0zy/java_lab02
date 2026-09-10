public class RubberDuck extends Duck implements Quackable {
    public void quack() {
        IO.println("RubberDuck squeak");
    }
    public void display() {
        IO.println("RubberDuck display");
    }
}
