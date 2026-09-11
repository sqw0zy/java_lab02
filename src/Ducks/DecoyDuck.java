package Ducks;

import FlyBehavior.FlyNoWay;
import QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    public void display() {
        IO.println("DecoyDuck display");
    }
}
