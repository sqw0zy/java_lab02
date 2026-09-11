package Ducks;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        IO.println("ModelDuck display");
    }
}
