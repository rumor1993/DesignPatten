package ch1_strategy_pattern.duck.quack;

public class MuteQuack implements QuacBehavior {

    @Override
    public void quack() {
        System.out.println(" 말을 못해요! ");
    }
}
