package Ducks;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        IO.println("Ducks.RedheadDuck dispay");
    }

}
