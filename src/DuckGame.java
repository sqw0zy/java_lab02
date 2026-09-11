import Ducks.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class DuckGame {
    public static void main(String[] args) {
        Duck mDuck = new MallardDuck();
        mDuck.performFly();
        mDuck.performQuack();

        IO.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        IO.println();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.setQuackBehavior(new TripleQuack());
        redheadDuck.performQuack();
    }
}
