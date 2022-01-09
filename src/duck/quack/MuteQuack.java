package duck.quack;

import duck.quack.QuacBehavior;

public class MuteQuack implements QuacBehavior {

    @Override
    public void quack() {
        System.out.println(" 말을 못해요! ");
    }
}
