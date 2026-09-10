public class MallardDuck extends Duck implements Quackable, Flyable {
    public void display() {
        IO.println("MallardDuck display");
    }
    public void quack() {
        IO.println("MallardDuck quack quack");
    }
    public void fly() {
        IO.println(getClass().getName() + " is flying");
    }
}
