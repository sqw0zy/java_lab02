package QuackBehavior;

public interface QuackBehavior {
    default void quack() {
        IO.println("quack in interface");
    };
}
