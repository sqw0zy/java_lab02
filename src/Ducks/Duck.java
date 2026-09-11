package Ducks;

import FlyBehavior.*;
import QuackBehavior.*;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        this(new FlyWithWings(), new Quack());
    }

    public Duck(FlyBehavior fb, QuackBehavior qb) {
        flyBehavior = fb;
        quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        IO.println("Duck is swimming");
    }
    public abstract void display();
}