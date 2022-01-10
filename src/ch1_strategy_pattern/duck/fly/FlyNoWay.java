package ch1_strategy_pattern.duck.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 저는 못 날아여! ");
    }
}
