package ch1_strategy_pattern.duck.quack;

public class Quack implements QuacBehavior {
    @Override
    public void quack() {
        System.out.println(" 꽥! ");
    }
}
