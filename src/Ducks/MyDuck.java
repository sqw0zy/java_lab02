package Ducks;

import FlyBehavior.FlyBehavior;
import FlyBehavior.FlyWithWings;
import QuackBehavior.QuackBehavior;
import QuackBehavior.TripleQuack;

public class MyDuck extends Duck {

    public MyDuck() {
        this(new FlyWithWings(), new TripleQuack());
    }
    public MyDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    public void display() {
        IO.println("MyDuck");
    }

}
