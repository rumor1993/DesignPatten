package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.fly.FlyWithWings;
import ch1_strategy_pattern.duck.quack.Quack;

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
