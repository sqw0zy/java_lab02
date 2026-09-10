public class RedheadDuck extends Duck implements Flyable, Quackable {
    public void display() {
        IO.println("RedheadDuck dispay");
    }
    public void quack() {
        IO.println(getClass().getName() + "quack quack");
    }
    public void fly() {
        IO.println(getClass().getName() + "is flying");
    }
}
