package duck;

import duck.fly.FlyWithWings;
import duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quacBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" 저는 청둥오리! ");
    }
}
