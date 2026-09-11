package Ducks;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        IO.println("Ducks.RubberDuck display");
    }
}
