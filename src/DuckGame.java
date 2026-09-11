import Ducks.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class DuckGame {
    public static void main(String[] args) {
        Duck mDuck = new MallardDuck();
        mDuck.display();
        mDuck.performFly();
        mDuck.performQuack();

        IO.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        //modelDuck.setFlyBehavior(new FlyRocketPowered());
        //modelDuck.performFly();

        IO.println();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        //redheadDuck.setQuackBehavior(new TripleQuack());
        redheadDuck.performQuack();

        IO.println();

        Duck myDuck = new MyDuck();
        myDuck.display();
        myDuck.performQuack();
        myDuck.performFly();

        IO.println();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        IO.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();
    }
}
